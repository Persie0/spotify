package p204p;

import androidx.car.app.model.Alert;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class enc implements dk00 {

    /* JADX INFO: renamed from: a */
    public final juk f61128a;

    /* JADX INFO: renamed from: b */
    public final int f61129b;

    /* JADX INFO: renamed from: c */
    public final int f61130c;

    public enc(juk jukVar, int i, int i2) {
        this.f61128a = jukVar;
        this.f61129b = i;
        this.f61130c = i2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    @Override // p204p.dk00
    /* JADX INFO: renamed from: b */
    public final fiz mo36243b(juk jukVar, int i, int i2) {
        juk jukVar2 = this.f61128a;
        juk jukVarMo26608y = jukVar.mo26608y(jukVar2);
        int i3 = this.f61130c;
        int i4 = this.f61129b;
        if (i2 == 1) {
            if (i4 != -3) {
                if (i == -3) {
                    i = i4;
                } else if (i4 != -2) {
                    if (i == -2) {
                        i = i4;
                    } else {
                        i += i4;
                        if (i < 0) {
                            i = Alert.DURATION_SHOW_INDEFINITELY;
                        }
                    }
                }
            }
            i2 = i3;
        }
        return (wj50.m88271j(jukVarMo26608y, jukVar2) && i == i4 && i2 == i3) ? this : mo39487h(jukVarMo26608y, i, i2);
    }

    @Override // p204p.fiz
    public Object collect(niz nizVar, fbk fbkVar) {
        Object objM56684z = kk40.m56684z(new dnc(nizVar, this, null, 0), fbkVar);
        return objM56684z == yuk.f276404a ? objM56684z : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: f */
    public String mo39485f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo39486g(sir0 sir0Var, fbk fbkVar);

    /* JADX INFO: renamed from: h */
    public abstract enc mo39487h(juk jukVar, int i, int i2);

    /* JADX INFO: renamed from: i */
    public fiz mo39488i() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public nzu0 mo39489j(xuk xukVar) {
        int i = this.f61129b;
        if (i == -3) {
            i = -2;
        }
        th00 b6bVar = new b6b(this, null, 8);
        rir0 rir0Var = new rir0(dyu.m37394z(xukVar, this.f61128a), xtm0.m92080a(i, this.f61130c, 4));
        rir0Var.m87264y0(3, rir0Var, b6bVar);
        return rir0Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strMo39485f = mo39485f();
        if (strMo39485f != null) {
            arrayList.add(strMo39485f);
        }
        dau dauVar = dau.f47107a;
        juk jukVar = this.f61128a;
        if (jukVar != dauVar) {
            arrayList.add("context=" + jukVar);
        }
        int i = this.f61129b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        int i2 = this.f61130c;
        if (i2 != 1) {
            arrayList.add("onBufferOverflow=".concat(pi9.m70095t(i2)));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(opo.m67555e(this));
        sb.append('[');
        return dq60.m36617q(sb, g6f.m43753y0(arrayList, ", ", null, null, null, 62), ']');
    }
}
