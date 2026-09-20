package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class x471 extends n471 {

    /* JADX INFO: renamed from: b */
    public final String f258003b;

    /* JADX INFO: renamed from: c */
    public final int f258004c;

    /* JADX INFO: renamed from: d */
    public final gh00 f258005d;

    public x471(Object obj, String str, int i, gh00 gh00Var) {
        super(obj);
        this.f258003b = str;
        this.f258004c = i;
        this.f258005d = gh00Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.f150228a);
        sb.append(", label=\"");
        sb.append(this.f258003b);
        sb.append("\", leadingIcon=");
        return edb.m38567p(sb, this.f258004c, ')');
    }
}
