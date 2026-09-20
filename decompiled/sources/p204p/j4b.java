package p204p;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j4b implements Comparable {

    /* JADX INFO: renamed from: a */
    public final String f108643a;

    /* JADX INFO: renamed from: b */
    public final long f108644b;

    /* JADX INFO: renamed from: c */
    public final long f108645c;

    /* JADX INFO: renamed from: d */
    public final boolean f108646d;

    /* JADX INFO: renamed from: e */
    public final File f108647e;

    /* JADX INFO: renamed from: f */
    public final long f108648f;

    public j4b(String str, long j, long j2, long j3, File file) {
        this.f108643a = str;
        this.f108644b = j;
        this.f108645c = j2;
        this.f108646d = file != null;
        this.f108647e = file;
        this.f108648f = j3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j4b j4bVar) {
        String str = j4bVar.f108643a;
        String str2 = this.f108643a;
        if (!str2.equals(str)) {
            return str2.compareTo(j4bVar.f108643a);
        }
        long j = this.f108644b - j4bVar.f108644b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f108644b);
        sb.append(", ");
        return ikc0.m50938j(this.f108645c, "]", sb);
    }
}
