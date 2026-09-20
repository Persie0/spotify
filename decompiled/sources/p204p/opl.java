package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class opl implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f167964a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f167965b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ upl f167966c;

    public /* synthetic */ opl(niz nizVar, upl uplVar, int i) {
        this.f167964a = i;
        this.f167965b = nizVar;
        this.f167966c = uplVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        npl nplVar;
        ppl pplVar;
        switch (this.f167964a) {
            case 0:
                if (fbkVar instanceof npl) {
                    nplVar = (npl) fbkVar;
                    int i = nplVar.f157027b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        nplVar.f157027b = i - Integer.MIN_VALUE;
                    } else {
                        nplVar = new npl(this, fbkVar);
                    }
                } else {
                    nplVar = new npl(this, fbkVar);
                }
                Object obj2 = nplVar.f157026a;
                int i2 = nplVar.f157027b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    List list = ((rs80) obj).f202226c;
                    ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((on3) this.f167966c.f232721b).m67397n(((qs80) it.next()).f192032a));
                    }
                    nplVar.f157027b = 1;
                    Object objEmit = this.f167965b.emit(arrayList, nplVar);
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
                if (fbkVar instanceof ppl) {
                    pplVar = (ppl) fbkVar;
                    int i3 = pplVar.f180063b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        pplVar.f180063b = i3 - Integer.MIN_VALUE;
                    } else {
                        pplVar = new ppl(this, fbkVar);
                    }
                } else {
                    pplVar = new ppl(this, fbkVar);
                }
                Object obj3 = pplVar.f180062a;
                int i4 = pplVar.f180063b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    List list2 = ((ey80) obj).f63989b;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : list2) {
                        i8e0 i8e0Var = (i8e0) obj4;
                        if (i8e0Var.f99766c || i8e0Var.f99769f != lnn0.f135185d) {
                            arrayList2.add(obj4);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((on3) this.f167966c.f232721b).m67397n(((i8e0) it2.next()).f99764a));
                    }
                    pplVar.f180063b = 1;
                    Object objEmit2 = this.f167965b.emit(arrayList3, pplVar);
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
