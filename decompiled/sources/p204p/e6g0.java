package p204p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes8.dex */
public final class e6g0 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56637a;

    /* JADX INFO: renamed from: b */
    public kqi0 f56638b;

    /* JADX INFO: renamed from: c */
    public int f56639c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f56640d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ e940 f56641e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ kqi0 f56642f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e6g0(String str, e940 e940Var, kqi0 kqi0Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f56637a = i;
        this.f56640d = str;
        this.f56641e = e940Var;
        this.f56642f = kqi0Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f56637a) {
            case 0:
                return new e6g0(this.f56640d, this.f56641e, this.f56642f, fbkVar, 0);
            default:
                return new e6g0(this.f56640d, this.f56641e, this.f56642f, fbkVar, 1);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f56637a) {
            case 0:
                break;
        }
        return ((e6g0) create(xukVar, fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        kqi0 kqi0Var;
        Bitmap bitmap;
        kqi0 kqi0Var2;
        Bitmap bitmap2;
        switch (this.f56637a) {
            case 0:
                int i = this.f56639c;
                if (i == 0) {
                    bga.m29073P(obj);
                    kqi0Var = this.f56642f;
                    String str = this.f56640d;
                    if (str != null) {
                        this.f56638b = kqi0Var;
                        this.f56639c = 1;
                        obj = vj50.m85733o(str, this, this.f56641e);
                        yuk yukVar = yuk.f276404a;
                        if (obj == yukVar) {
                            return yukVar;
                        }
                    } else {
                        bitmap = null;
                    }
                    kqi0Var.setValue(bitmap);
                    return w2a1.f247311a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kqi0Var = this.f56638b;
                bga.m29073P(obj);
                bitmap = (Bitmap) obj;
                kqi0Var.setValue(bitmap);
                return w2a1.f247311a;
            default:
                int i2 = this.f56639c;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    kqi0Var2 = this.f56642f;
                    String str2 = this.f56640d;
                    if (str2 != null) {
                        this.f56638b = kqi0Var2;
                        this.f56639c = 1;
                        obj = vj50.m85733o(str2, this, this.f56641e);
                        yuk yukVar2 = yuk.f276404a;
                        if (obj == yukVar2) {
                            return yukVar2;
                        }
                    } else {
                        bitmap2 = null;
                    }
                    kqi0Var2.setValue(bitmap2);
                    return w2a1.f247311a;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kqi0Var2 = this.f56638b;
                bga.m29073P(obj);
                bitmap2 = (Bitmap) obj;
                kqi0Var2.setValue(bitmap2);
                return w2a1.f247311a;
        }
    }
}
