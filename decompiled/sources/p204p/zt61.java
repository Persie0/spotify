package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes3.dex */
public final class zt61 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f286077a;

    /* JADX INFO: renamed from: b */
    public int f286078b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vh00 f286079c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ k3r0 f286080d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ k6q0 f286081e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zt61(vh00 vh00Var, k3r0 k3r0Var, k6q0 k6q0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f286077a = i;
        this.f286079c = vh00Var;
        this.f286080d = k3r0Var;
        this.f286081e = k6q0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f286077a) {
            case 0:
                return new zt61(this.f286079c, this.f286080d, this.f286081e, fbkVar, 0);
            default:
                return new zt61(this.f286079c, this.f286080d, this.f286081e, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f286077a) {
            case 0:
                break;
        }
        return ((zt61) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f286077a) {
            case 0:
                int i = this.f286078b;
                if (i == 0) {
                    bga.m29073P(obj);
                    Offset offset = new Offset(this.f286081e.f119812c);
                    this.f286078b = 1;
                    Object objMo24510D0 = this.f286079c.mo24510D0(this.f286080d, offset, this);
                    yuk yukVar = yuk.f276404a;
                    if (objMo24510D0 == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
            default:
                int i2 = this.f286078b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    Offset offset2 = new Offset(this.f286081e.f119812c);
                    this.f286078b = 1;
                    Object objMo24510D1 = this.f286079c.mo24510D0(this.f286080d, offset2, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objMo24510D1 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
        }
    }
}
