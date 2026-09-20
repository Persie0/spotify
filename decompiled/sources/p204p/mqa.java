package p204p;

import com.google.protobuf.StringValue;

/* JADX INFO: loaded from: classes10.dex */
public final class mqa extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f146232a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k140 f146233b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mqa(k140 k140Var, int i) {
        super(1);
        this.f146232a = i;
        this.f146233b = k140Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f146232a) {
            case 0:
                this.f146233b.m55047q((StringValue) obj);
                break;
            default:
                this.f146233b.m55046m((StringValue) obj);
                break;
        }
        return w2a1.f247311a;
    }
}
