package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bcp implements d7l0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f25928a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f25929b;

    public /* synthetic */ bcp(Object obj, int i) {
        this.f25928a = i;
        this.f25929b = obj;
    }

    @Override // p204p.d7l0
    /* JADX INFO: renamed from: a */
    public final void mo28779a(int i) {
        switch (this.f25928a) {
            case 0:
                dcp dcpVar = (dcp) this.f25929b;
                if (dcpVar.f47598f) {
                    Integer num = dcpVar.f47602j;
                    boolean z = false;
                    if (num != null && i < num.intValue()) {
                        z = true;
                    }
                    dcpVar.f47602j = Integer.valueOf(i);
                    String str = dcpVar.f47604l;
                    dcpVar.f47604l = null;
                    if (z && str != null && dcpVar.f47596d.m57858c()) {
                        dcpVar.m35669b(str, str);
                        break;
                    }
                }
                break;
            default:
                ((u0d0) this.f25929b).f225464t = Integer.valueOf(i);
                break;
        }
    }
}
