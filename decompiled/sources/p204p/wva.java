package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class wva extends qva {
    /* JADX INFO: renamed from: m */
    public static wva m89079m(String str) {
        wva wvaVar = new wva(str.toCharArray());
        wvaVar.f192950b = 0L;
        wvaVar.m73982l(str.length() - 1);
        return wvaVar;
    }

    @Override // p204p.qva
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof wva) && m73978d().equals(((wva) obj).m73978d())) {
            return true;
        }
        return super.equals(obj);
    }
}
