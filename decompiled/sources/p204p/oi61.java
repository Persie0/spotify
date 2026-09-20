package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class oi61 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f165718a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f165719b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hkm0 f165720c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f165721d;

    public /* synthetic */ oi61(niz nizVar, hkm0 hkm0Var, int i, int i2) {
        this.f165718a = i2;
        this.f165719b = nizVar;
        this.f165720c = hkm0Var;
        this.f165721d = i;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        ni61 ni61Var;
        qi61 qi61Var;
        switch (this.f165718a) {
            case 0:
                if (fbkVar instanceof ni61) {
                    ni61Var = (ni61) fbkVar;
                    int i = ni61Var.f154189b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ni61Var.f154189b = i - Integer.MIN_VALUE;
                    } else {
                        ni61Var = new ni61(this, fbkVar);
                    }
                } else {
                    ni61Var = new ni61(this, fbkVar);
                }
                Object obj2 = ni61Var.f154188a;
                int i2 = ni61Var.f154189b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    List list = (List) obj;
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((dkm0) it.next()) instanceof fkm0) {
                                ArrayList arrayList = new ArrayList(list);
                                int i3 = this.f165721d;
                                if (i3 == 0) {
                                    arrayList.add(0, new ujm0(1));
                                } else if (i3 == h6f.m46714K(this.f165720c.f92458c)) {
                                    arrayList.add(0, new ujm0(2));
                                    arrayList.add(new ujm0(2));
                                } else {
                                    arrayList.add(0, new ujm0(2));
                                }
                                list = arrayList;
                            }
                        }
                    }
                    ni61Var.f154189b = 1;
                    Object objEmit = this.f165719b.emit(list, ni61Var);
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
                if (fbkVar instanceof qi61) {
                    qi61Var = (qi61) fbkVar;
                    int i4 = qi61Var.f188949b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        qi61Var.f188949b = i4 - Integer.MIN_VALUE;
                    } else {
                        qi61Var = new qi61(this, fbkVar);
                    }
                } else {
                    qi61Var = new qi61(this, fbkVar);
                }
                Object obj3 = qi61Var.f188948a;
                int i5 = qi61Var.f188949b;
                if (i5 == 0) {
                    bga.m29073P(obj3);
                    List list2 = (List) obj;
                    ArrayList arrayList2 = new ArrayList(i6f.m49804T(list2, 10));
                    int i6 = 0;
                    for (Object obj4 : list2) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            h6f.m46722S();
                            throw null;
                        }
                        arrayList2.add(new sec1((dkm0) obj4, this.f165720c.f92456a + ":" + this.f165721d + ":" + i6));
                        i6 = i7;
                    }
                    qi61Var.f188949b = 1;
                    Object objEmit2 = this.f165719b.emit(arrayList2, qi61Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
        }
    }
}
