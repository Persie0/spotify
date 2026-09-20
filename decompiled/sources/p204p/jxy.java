package p204p;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes11.dex */
public final class jxy implements FileFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ File f117245a;

    public jxy(File file) {
        this.f117245a = file;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return file.equals(this.f117245a);
    }
}
