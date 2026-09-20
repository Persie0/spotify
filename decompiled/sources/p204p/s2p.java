package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class s2p implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f205046a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f205047b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e3p f205048c;

    public /* synthetic */ s2p(niz nizVar, e3p e3pVar, int i) {
        this.f205046a = i;
        this.f205047b = nizVar;
        this.f205048c = e3pVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        r2p r2pVar;
        Object wjbVar;
        t2p t2pVar;
        switch (this.f205046a) {
            case 0:
                if (fbkVar instanceof r2p) {
                    r2pVar = (r2p) fbkVar;
                    int i = r2pVar.f195176b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        r2pVar.f195176b = i - Integer.MIN_VALUE;
                    } else {
                        r2pVar = new r2p(this, fbkVar);
                    }
                } else {
                    r2pVar = new r2p(this, fbkVar);
                }
                Object obj2 = r2pVar.f195175a;
                int i2 = r2pVar.f195176b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    p1p p1pVar = (p1p) obj;
                    if ((p1pVar instanceof o1p) || (p1pVar instanceof n1p)) {
                        wjbVar = xjb.f262083a;
                    } else if (p1pVar instanceof l1p) {
                        wjbVar = vjb.f241935a;
                    } else {
                        if (!(p1pVar instanceof m1p)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        List list = ((m1p) p1pVar).f139043a;
                        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(this.f205048c.m37669c((rvc) it.next()));
                        }
                        wjbVar = new wjb(arrayList);
                    }
                    r2pVar.f195176b = 1;
                    Object objEmit = this.f205047b.emit(wjbVar, r2pVar);
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
                if (fbkVar instanceof t2p) {
                    t2pVar = (t2p) fbkVar;
                    int i3 = t2pVar.f216601b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        t2pVar.f216601b = i3 - Integer.MIN_VALUE;
                    } else {
                        t2pVar = new t2p(this, fbkVar);
                    }
                } else {
                    t2pVar = new t2p(this, fbkVar);
                }
                Object obj3 = t2pVar.f216600a;
                int i4 = t2pVar.f216601b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    this.f205048c.getClass();
                    List listM37652K = e3p.m37652K((p1p) obj);
                    t2pVar.f216601b = 1;
                    Object objEmit2 = this.f205047b.emit(listM37652K, t2pVar);
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
