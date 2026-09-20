package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final class pjc0 implements xv41 {

    /* JADX INFO: renamed from: a */
    public final xv41 f178224a;

    /* JADX INFO: renamed from: b */
    public final qe70 f178225b;

    /* JADX WARN: Multi-variable type inference failed */
    public pjc0(gh00 gh00Var, xv41 xv41Var) {
        this.f178224a = xv41Var;
        this.f178225b = (qe70) gh00Var;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [p.gh00, p.qe70] */
    @Override // p204p.eb11
    /* JADX INFO: renamed from: c */
    public final List mo27502c() {
        List listMo27502c = this.f178224a.mo27502c();
        ArrayList arrayList = new ArrayList(i6f.m49804T(listMo27502c, 10));
        Iterator it = listMo27502c.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f178225b.invoke(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        njc0 njc0Var;
        if (fbkVar instanceof njc0) {
            njc0Var = (njc0) fbkVar;
            int i = njc0Var.f154559c;
            if ((i & Integer.MIN_VALUE) != 0) {
                njc0Var.f154559c = i - Integer.MIN_VALUE;
            } else {
                njc0Var = new njc0(this, fbkVar);
            }
        } else {
            njc0Var = new njc0(this, fbkVar);
        }
        Object obj = njc0Var.f154557a;
        int i2 = njc0Var.f154559c;
        if (i2 == 0) {
            bga.m29073P(obj);
            ps80 ps80Var = new ps80(27, nizVar, this);
            njc0Var.f154559c = 1;
            Object objCollect = this.f178224a.collect(ps80Var, njc0Var);
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
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p.gh00, p.qe70] */
    @Override // p204p.xv41
    public final Object getValue() {
        return this.f178225b.invoke(this.f178224a.getValue());
    }
}
