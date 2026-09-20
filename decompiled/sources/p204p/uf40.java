package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class uf40 {

    /* JADX INFO: renamed from: a */
    public final Object f229674a;

    /* JADX INFO: renamed from: b */
    public final Object f229675b;

    /* JADX INFO: renamed from: c */
    public final Object f229676c;

    public uf40(Object obj, Object obj2, Object obj3) {
        this.f229674a = obj;
        this.f229675b = obj2;
        this.f229676c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m82952a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f229674a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f229675b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f229676c);
        return new IllegalArgumentException(sb.toString());
    }
}
