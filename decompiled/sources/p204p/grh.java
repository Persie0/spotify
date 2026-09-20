package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class grh implements yto {

    /* JADX INFO: renamed from: a */
    public final zh21 f83769a;

    public grh(zh21 zh21Var) {
        this.f83769a = zh21Var;
    }

    @Override // p204p.yto
    /* JADX INFO: renamed from: b */
    public final String mo28600b(String str) {
        Iterator<E> it = this.f83769a.iterator();
        while (it.hasNext()) {
            str = ((yto) it.next()).mo28600b(str);
        }
        return str;
    }
}
