package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jwb implements hbb {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ lwb f116613a;

    public /* synthetic */ jwb(lwb lwbVar) {
        this.f116613a = lwbVar;
    }

    /* JADX INFO: renamed from: a */
    public void m54430a() {
        lwb lwbVar = this.f116613a;
        synchronized (lwbVar.f137502a) {
            try {
                if (lwbVar.f137510i == 5) {
                    lwbVar.m60110k(lwbVar.f137507f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p204p.hbb
    public Object attachCompleter(gbb gbbVar) {
        String str;
        lwb lwbVar = this.f116613a;
        synchronized (lwbVar.f137502a) {
            wj50.m88281r("Release completer expected to be null", lwbVar.f137512k == null);
            lwbVar.f137512k = gbbVar;
            str = "Release[session=" + lwbVar + "]";
        }
        return str;
    }
}
