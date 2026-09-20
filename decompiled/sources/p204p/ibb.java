package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ibb extends AbstractC2156n9 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ jbb f100500h;

    public ibb(jbb jbbVar) {
        this.f100500h = jbbVar;
    }

    @Override // p204p.AbstractC2156n9
    /* JADX INFO: renamed from: j */
    public final String mo50171j() {
        gbb gbbVar = (gbb) this.f100500h.f110726a.get();
        return gbbVar == null ? "Completer object has been garbage collected, future will fail soon" : edb.m38568q(new StringBuilder("tag=["), gbbVar.f78253a, "]");
    }
}
