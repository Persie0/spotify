package p204p;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class t13 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f216135a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f216136b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hz80 f216137c;

    public /* synthetic */ t13(niz nizVar, Object obj, hz80 hz80Var, int i) {
        this.f216135a = i;
        this.f216136b = nizVar;
        this.f216137c = hz80Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        s13 s13Var;
        uvb1 uvb1Var;
        switch (this.f216135a) {
            case 0:
                if (fbkVar instanceof s13) {
                    s13Var = (s13) fbkVar;
                    int i = s13Var.f204579b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        s13Var.f204579b = i - Integer.MIN_VALUE;
                    } else {
                        s13Var = new s13(this, fbkVar);
                    }
                } else {
                    s13Var = new s13(this, fbkVar);
                }
                Object obj2 = s13Var.f204578a;
                int i2 = s13Var.f204579b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    hz80 hz80Var = this.f216137c;
                    f4k f4kVar = new f4k(hz80Var.f96825a, new t3k(Uri.parse(hz80Var.f96826b.m84311c(2))), (String) obj);
                    s13Var.f204579b = 1;
                    Object objEmit = this.f216136b.emit(f4kVar, s13Var);
                    yuk yukVar = yuk.f276404a;
                    if (objEmit == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof uvb1) {
                    uvb1Var = (uvb1) fbkVar;
                    int i3 = uvb1Var.f234416b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        uvb1Var.f234416b = i3 - Integer.MIN_VALUE;
                    } else {
                        uvb1Var = new uvb1(this, fbkVar);
                    }
                } else {
                    uvb1Var = new uvb1(this, fbkVar);
                }
                Object obj3 = uvb1Var.f234415a;
                int i4 = uvb1Var.f234416b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    Boolean boolValueOf = Boolean.valueOf(qub1.m73895a((Map) obj) && this.f216137c.f96819T0);
                    uvb1Var.f234416b = 1;
                    Object objEmit2 = this.f216136b.emit(boolValueOf, uvb1Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
        }
    }
}
