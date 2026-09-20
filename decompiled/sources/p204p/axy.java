package p204p;

import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public final class axy extends zwy {

    /* JADX INFO: renamed from: b */
    public boolean f21048b;

    /* JADX INFO: renamed from: c */
    public File[] f21049c;

    /* JADX INFO: renamed from: d */
    public int f21050d;

    /* JADX INFO: renamed from: e */
    public boolean f21051e;

    @Override // p204p.exy
    /* JADX INFO: renamed from: a */
    public final File mo27440a() {
        boolean z = this.f21051e;
        File file = this.f63872a;
        if (!z && this.f21049c == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f21049c = fileArrListFiles;
            if (fileArrListFiles == null) {
                this.f21051e = true;
            }
        }
        File[] fileArr = this.f21049c;
        if (fileArr == null || this.f21050d >= fileArr.length) {
            if (this.f21048b) {
                return null;
            }
            this.f21048b = true;
            return file;
        }
        wj50.m88279p(fileArr);
        int i = this.f21050d;
        this.f21050d = i + 1;
        return fileArr[i];
    }
}
