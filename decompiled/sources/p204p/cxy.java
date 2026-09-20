package p204p;

import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public final class cxy extends zwy {

    /* JADX INFO: renamed from: b */
    public boolean f43115b;

    /* JADX INFO: renamed from: c */
    public File[] f43116c;

    /* JADX INFO: renamed from: d */
    public int f43117d;

    @Override // p204p.exy
    /* JADX INFO: renamed from: a */
    public final File mo27440a() {
        boolean z = this.f43115b;
        File file = this.f63872a;
        if (!z) {
            this.f43115b = true;
            return file;
        }
        File[] fileArr = this.f43116c;
        if (fileArr != null && this.f43117d >= fileArr.length) {
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f43116c = fileArrListFiles;
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return null;
            }
        }
        File[] fileArr2 = this.f43116c;
        wj50.m88279p(fileArr2);
        int i = this.f43117d;
        this.f43117d = i + 1;
        return fileArr2[i];
    }
}
