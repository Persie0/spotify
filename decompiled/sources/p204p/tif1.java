package p204p;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class tif1 {

    /* JADX INFO: renamed from: a */
    public final File f220678a;

    /* JADX INFO: renamed from: b */
    public final String f220679b;

    public tif1(File file, String str) {
        this.f220678a = file;
        if (str == null) {
            throw new NullPointerException("Null splitId");
        }
        this.f220679b = str;
    }

    /* JADX INFO: renamed from: a */
    public final File m80923a() {
        return this.f220678a;
    }

    /* JADX INFO: renamed from: b */
    public final String m80924b() {
        return this.f220679b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tif1) {
            tif1 tif1Var = (tif1) obj;
            if (this.f220678a.equals(tif1Var.f220678a) && this.f220679b.equals(tif1Var.f220679b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f220678a.hashCode() ^ 1000003) * 1000003) ^ this.f220679b.hashCode();
    }

    public final String toString() {
        return dq60.m36615o("SplitFileInfo{splitFile=", this.f220678a.toString(), ", splitId=", this.f220679b, "}");
    }
}
