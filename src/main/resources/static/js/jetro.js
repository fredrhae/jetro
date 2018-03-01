$('#confirmacaoExclusaoModal').on('show.bs.modal', function(event) {
	var button = $(event.relatedTarget);
	
	var codigoRelatorio = button.data('idrelatorio');

	var modal = $(this);
	var form = modal.find('form');
	var action = form.data('url-base');
	if (!action.endsWith('/')) {
		action += '/';
	}
	form.attr('action', action + codigoRelatorio);
	
	modal.find('.modal-body span').html('Tem certeza que deseja excluir o relatório <strong>' + codigoRelatorio + '</strong>?');
});