package p204p;

import java.io.Serializable;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class cy00 {

    /* JADX INFO: renamed from: a */
    public final ry00 f43130a;

    /* JADX INFO: renamed from: b */
    public final v0y f43131b;

    /* JADX INFO: renamed from: c */
    public final px00 f43132c;

    /* JADX INFO: renamed from: d */
    public final z9t f43133d;

    /* JADX INFO: renamed from: e */
    public final luk f43134e;

    public cy00(ry00 ry00Var, v0y v0yVar, px00 px00Var, z9t z9tVar, luk lukVar) {
        this.f43130a = ry00Var;
        this.f43131b = v0yVar;
        this.f43132c = px00Var;
        this.f43133d = z9tVar;
        this.f43134e = lukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m34335a(cy00 cy00Var, ux00 ux00Var, ibk ibkVar) {
        by00 by00Var;
        if (ibkVar instanceof by00) {
            by00Var = (by00) ibkVar;
            int i = by00Var.f32034c;
            if ((i & Integer.MIN_VALUE) != 0) {
                by00Var.f32034c = i - Integer.MIN_VALUE;
            } else {
                by00Var = new by00(cy00Var, ibkVar);
            }
        } else {
            by00Var = new by00(cy00Var, ibkVar);
        }
        Object obj = by00Var.f32032a;
        int i2 = by00Var.f32034c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                px00 px00Var = cy00Var.f43132c;
                String str = ux00Var.f234764c;
                LinkedHashMap linkedHashMap = ux00Var.f234765d;
                by00Var.f32034c = 1;
                Serializable serializableM71342g = px00Var.m71342g(str, linkedHashMap, by00Var);
                yuk yukVar = yuk.f276404a;
                if (serializableM71342g == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return ey00.f63908a;
        } catch (Exception e) {
            return new iy00(e);
        }
    }
}
