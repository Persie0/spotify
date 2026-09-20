package p204p;

import java.util.Collections;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes5.dex */
public final class mjc0 implements xv41 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f144230a;

    /* JADX INFO: renamed from: b */
    public final xv41 f144231b;

    public /* synthetic */ mjc0(xv41 xv41Var, int i) {
        this.f144230a = i;
        this.f144231b = xv41Var;
    }

    @Override // p204p.eb11
    /* JADX INFO: renamed from: c */
    public final List mo27502c() {
        switch (this.f144230a) {
            case 0:
                nx50 nx50Var = (nx50) this.f144231b.getValue();
                return Collections.singletonList(Boolean.valueOf(nx50Var.f159369b && nx50Var.f159368a));
            default:
                iit0 iit0Var = (iit0) ((nuu0) this.f144231b).f158717a.getValue();
                return Collections.singletonList(iit0Var != null ? new k8b(iit0Var.f102629a, iit0Var.f102630b) : null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        ljc0 ljc0Var;
        ojc0 ojc0Var;
        switch (this.f144230a) {
            case 0:
                if (fbkVar instanceof ljc0) {
                    ljc0Var = (ljc0) fbkVar;
                    int i = ljc0Var.f134057c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ljc0Var.f134057c = i - Integer.MIN_VALUE;
                    } else {
                        ljc0Var = new ljc0(this, fbkVar);
                    }
                } else {
                    ljc0Var = new ljc0(this, fbkVar);
                }
                Object obj = ljc0Var.f134055a;
                int i2 = ljc0Var.f134057c;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    ap0 ap0Var = new ap0(nizVar, this, 20);
                    ljc0Var.f134057c = 1;
                    Object objCollect = this.f144231b.collect(ap0Var, ljc0Var);
                    yuk yukVar = yuk.f276404a;
                    if (objCollect == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                throw new KotlinNothingValueException();
            default:
                if (fbkVar instanceof ojc0) {
                    ojc0Var = (ojc0) fbkVar;
                    int i3 = ojc0Var.f166038c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ojc0Var.f166038c = i3 - Integer.MIN_VALUE;
                    } else {
                        ojc0Var = new ojc0(this, fbkVar);
                    }
                } else {
                    ojc0Var = new ojc0(this, fbkVar);
                }
                Object obj2 = ojc0Var.f166036a;
                int i4 = ojc0Var.f166038c;
                if (i4 == 0) {
                    bga.m29073P(obj2);
                    nuu0 nuu0Var = (nuu0) this.f144231b;
                    ap0 ap0Var2 = new ap0(nizVar, this, 21);
                    ojc0Var.f166038c = 1;
                    Object objCollect2 = nuu0Var.f158717a.collect(ap0Var2, ojc0Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objCollect2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                throw new KotlinNothingValueException();
        }
    }

    @Override // p204p.xv41
    public final Object getValue() {
        switch (this.f144230a) {
            case 0:
                nx50 nx50Var = (nx50) this.f144231b.getValue();
                return Boolean.valueOf(nx50Var.f159369b && nx50Var.f159368a);
            default:
                iit0 iit0Var = (iit0) ((nuu0) this.f144231b).f158717a.getValue();
                if (iit0Var != null) {
                    return new k8b(iit0Var.f102629a, iit0Var.f102630b);
                }
                return null;
        }
    }
}
