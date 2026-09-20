package p204p;

import android.os.Bundle;
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.externalintegration.ubi.UbiSpecificationId;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class azx {

    /* JADX INFO: renamed from: a */
    public final Scheduler f21698a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f21699b;

    /* JADX INFO: renamed from: c */
    public final Set f21700c;

    /* JADX INFO: renamed from: d */
    public final Set f21701d;

    /* JADX INFO: renamed from: e */
    public final i780 f21702e;

    /* JADX INFO: renamed from: f */
    public final ozx f21703f;

    /* JADX INFO: renamed from: g */
    public final chp f21704g;

    /* JADX INFO: renamed from: h */
    public final Observable f21705h;

    /* JADX INFO: renamed from: i */
    public final Observable f21706i;

    /* JADX INFO: renamed from: j */
    public final kps f21707j;

    public azx(Scheduler scheduler, Scheduler scheduler2, Set set, Set set2, i780 i780Var, ozx ozxVar, chp chpVar, Observable observable, Observable observable2, kps kpsVar) {
        this.f21698a = scheduler;
        this.f21699b = scheduler2;
        this.f21700c = set;
        this.f21701d = set2;
        this.f21702e = i780Var;
        this.f21703f = ozxVar;
        this.f21704g = chpVar;
        this.f21705h = observable;
        this.f21706i = observable2;
        this.f21707j = kpsVar;
    }

    /* JADX INFO: renamed from: a */
    public static final roa m27700a(azx azxVar, roa roaVar) {
        ExternalAccessoryDescription externalAccessoryDescriptionM76032b;
        return (roaVar.m76040j() && (externalAccessoryDescriptionM76032b = roaVar.m76032b()) != null) ? roa.m76031a(roaVar, null, null, false, false, azxVar.f21703f.m68667b(externalAccessoryDescriptionM76032b).m85744y(), false, 114687) : roaVar;
    }

    /* JADX INFO: renamed from: b */
    public static final void m27701b(azx azxVar, roa roaVar) {
        UbiSpecificationId ubiSpecificationIdM76038h = roaVar.m76038h();
        if (ubiSpecificationIdM76038h == UbiSpecificationId.UNKNOWN) {
            return;
        }
        n0y n0yVar = new n0y(ubiSpecificationIdM76038h, roaVar.m76035e(), (Integer) null, 12);
        chp chpVar = azxVar.f21704g;
        if (((uw91) chpVar.f38055b.get(n0yVar.m63464c())) != null) {
            chpVar.f38054a.mo57449i(sli0.m78486m(n0yVar.m63465d()).mo24514e(), null);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m27702c(azx azxVar, List list, UbiSpecificationId ubiSpecificationId) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(new m0y(((axx) it.next()).m27437a(), i));
            i++;
        }
        chp chpVar = azxVar.f21704g;
        if (chpVar.f38055b.containsKey(ubiSpecificationId)) {
            chpVar.f38056c.put(ubiSpecificationId, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m27703d(roa roaVar, ibk ibkVar) {
        tyx tyxVar;
        if (ibkVar instanceof tyx) {
            tyxVar = (tyx) ibkVar;
            int i = tyxVar.f225070c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tyxVar.f225070c = i - Integer.MIN_VALUE;
            } else {
                tyxVar = new tyx(this, ibkVar);
            }
        } else {
            tyxVar = new tyx(this, ibkVar);
        }
        Object obj = tyxVar.f225068a;
        int i2 = tyxVar.f225070c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        Single singleM27704e = m27704e(roaVar, null);
        tyxVar.f225070c = 1;
        Object objM96567o = zn91.m96567o(singleM27704e, tyxVar);
        yuk yukVar = yuk.f276404a;
        return objM96567o == yukVar ? yukVar : objM96567o;
    }

    /* JADX INFO: renamed from: e */
    public final Single m27704e(roa roaVar, Bundle bundle) {
        return this.f21705h.filter(wyx.f256387b).switchMap(new xyx(0, this, roaVar)).subscribeOn(this.f21699b).take(1L).flatMap(new xst(this, roaVar, bundle, 17)).map(new drw(this, 4)).flatMapSingle(new vux(this, 1)).switchMap(new xeu(this, 9)).singleOrError().observeOn(this.f21698a).doOnError(new uyx(roaVar, 0));
    }

    /* JADX INFO: renamed from: f */
    public final Observable m27705f(roa roaVar, Bundle bundle) {
        return this.f21705h.filter(wyx.f256387b).switchMap(new xyx(0, this, roaVar)).subscribeOn(this.f21699b).switchMap(new q6u(this, roaVar, bundle, 16)).map(new cdv(this, 3)).distinctUntilChanged().switchMap(new dmu(this, 7)).observeOn(this.f21698a).doOnError(new uyx(roaVar, 1));
    }

    /* JADX INFO: renamed from: g */
    public final cxx m27706g(roa roaVar) {
        Object next;
        Set set = this.f21701d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((dxx) obj).mo34866a(roaVar)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1) {
            na6.m63957e("Multiple external content providers for the same input: " + roaVar);
        }
        dxx dxxVar = (dxx) g6f.m43745s0(arrayList);
        if (dxxVar != null) {
            return dxxVar.mo34867b(roaVar);
        }
        Iterator it = this.f21700c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((m8d0) next).mo48695a(roaVar));
        m8d0 m8d0Var = (m8d0) next;
        if (m8d0Var != null) {
            return m8d0Var.mo48696b();
        }
        return null;
    }
}
