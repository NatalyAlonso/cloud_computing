//<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>


    window.imagenVacia = 'data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///ywAAAAAAQABAAACAUwAOw==';

    window.mostrarVistaPrevia = function mostrarVistaPrevia() {

        var Archivos, Lector;


        Archivos = jQuery('#archivo')[0].files;
        if (Archivos.length > 0) {

            Lector = new FileReader();
            Lector.onloadend = function(e) {
                var origen, tipo;

                //Envia la imagen a la pantalla
                origen = e.target; //objeto FileReader
                //Prepara la información sobre la imagen
                tipo = window.obtenerTipoMIME(origen.result.substring(0, 30));


                //Si el tipo de archivo es válido lo muestra, 
                //sino muestra un mensaje 
                if (tipo !== 'image/jpeg' && tipo !== 'image/png' && tipo !== 'image/gif') {
                    jQuery('#vistaPrevia').attr('src', window.imagenVacia);
                    alert('El formato de imagen no es válido: debe seleccionar una imagen JPG, PNG o GIF.');
                } else {
                    jQuery('#vistaPrevia').attr('src', origen.result);
                    window.obtenerMedidas();
                }

            };
            Lector.onerror = function(e) {
                console.log(e)
            }
            Lector.readAsDataURL(Archivos[0]);

        } else {
            var objeto = jQuery('#archivo');
            objeto.replaceWith(objeto.val('').clone());
            jQuery('#vistaPrevia').attr('src', window.imagenVacia);
        };


    };

    //Lee el tipo MIME de la cabecera de la imagen
    window.obtenerTipoMIME = function obtenerTipoMIME(cabecera) {
        return cabecera.replace(/data:([^;]+).*/, '\$1');
    }

    //Obtiene las medidas de la imagen y las agrega a la 
    //etiqueta infoTamaño
    window.obtenerMedidas = function obtenerMedidas() {
        jQuery('<img/>').bind('load', function(e) {

            

        }).attr('src', jQuery('#vistaPrevia').attr('src'));
    }

    jQuery(document).ready(function() {

        //Cargamos la imagen "vacía" que actuará como Placeholder
        jQuery('#vistaPrevia').attr('src', window.imagenVacia);

        //El input del archivo lo vigilamos con un "delegado"
        jQuery('#botonera').on('change', '#archivo', function(e) {
            window.mostrarVistaPrevia();
        });

        //El botón Cancelar lo vigilamos normalmente
        jQuery('#cancelar').on('click', function(e) {
            var objeto = jQuery('#archivo');
            objeto.replaceWith(objeto.val('').clone());

            jQuery('#vistaPrevia').attr('src', window.imagenVacia);
            jQuery('#infoNombre').text('[Seleccione una imagen]');
            jQuery('#infoTamaño').text('');
        });

    });
