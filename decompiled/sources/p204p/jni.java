package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class jni extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f114114a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kni f114115b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jni(kni kniVar, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f114114a = i;
        this.f114115b = kniVar;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f114114a) {
            case 0:
                return new jni(this.f114115b, fbkVar, 0);
            default:
                return new jni(this.f114115b, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f114114a) {
            case 0:
                jni jniVar = (jni) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                jniVar.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                jni jniVar2 = (jni) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                jniVar2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f114114a) {
            case 0:
                bga.m29073P(obj);
                this.f114115b.f124421i.m35665c("");
                break;
            default:
                bga.m29073P(obj);
                this.f114115b.f124422j.m33892a();
                break;
        }
        return w2a1.f247311a;
    }
}
