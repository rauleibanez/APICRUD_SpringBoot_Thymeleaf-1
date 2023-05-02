function eliminar(id){
  Swal.fire({
    title: 'Do you want to delete the record '+ id + '?',
    showDenyButton: true,
    showCancelButton: false,
    confirmButtonText: 'Delete',
    denyButtonText: `Don't Delete`,
  }).then((OK) => {
    /* Read more about isConfirmed, isDenied below */
    if (OK.isConfirmed) {
      $.ajax({url:"/eliminar/"+id});
      Swal.fire('Delete!', '', 'success');      
    } else if (result.isDenied) {
      Swal.fire('Record is not delete', '', 'info');      
    }
    location.href="/listar";
  })
}