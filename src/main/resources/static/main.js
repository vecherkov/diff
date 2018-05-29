function generateZip() {
    var zip = new JSZip();
    zip.file("diff.txt", document.getElementById("diff").innerHTML);
    zip.generateAsync({type:"blob"})
    .then(function(content) {
        saveAs(content, "diff.zip");
    });
}
