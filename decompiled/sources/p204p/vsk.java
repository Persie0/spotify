package p204p;

import com.spotify.identity.proto.p081v3.IdentityV3$Image;
import com.spotify.identity.proto.p081v3.IdentityV3$UserProfile;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import spotify.profile_esperanto.proto.GetProfilesRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class vsk {

    /* JADX INFO: renamed from: a */
    public final C2048kd f244452a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f244453b;

    public vsk(C2048kd c2048kd, Scheduler scheduler) {
        this.f244452a = c2048kd;
        this.f244453b = scheduler;
    }

    /* JADX INFO: renamed from: a */
    public static final gmr0 m86358a(vsk vskVar, IdentityV3$UserProfile identityV3$UserProfile) {
        Object next;
        String value = identityV3$UserProfile.m11973z().getValue();
        String value2 = identityV3$UserProfile.m11970w().getValue();
        String value3 = identityV3$UserProfile.m11972y().getValue();
        wj50.m88279p(value3);
        if (wl51.m88460J0(value3)) {
            value3 = null;
        }
        String value4 = identityV3$UserProfile.m11964q().getValue();
        ae50 ae50VarM11968u = identityV3$UserProfile.m11968u();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM11968u, 10));
        Iterator<E> it = ae50VarM11968u.iterator();
        while (it.hasNext()) {
            arrayList.add(((IdentityV3$Image) it.next()).getUrl());
        }
        Iterator<E> it2 = identityV3$UserProfile.m11968u().iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                IdentityV3$Image identityV3$Image = (IdentityV3$Image) next;
                int iM11960p = identityV3$Image.m11960p() * identityV3$Image.m11959o();
                do {
                    Object next2 = it2.next();
                    IdentityV3$Image identityV3$Image2 = (IdentityV3$Image) next2;
                    int iM11960p2 = identityV3$Image2.m11960p() * identityV3$Image2.m11959o();
                    if (iM11960p < iM11960p2) {
                        next = next2;
                        iM11960p = iM11960p2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        IdentityV3$Image identityV3$Image3 = (IdentityV3$Image) next;
        return new gmr0(value, value2, value3, value4, arrayList, identityV3$Image3 != null ? identityV3$Image3.getUrl() : null, identityV3$UserProfile.getColor().getValue(), identityV3$UserProfile.m11965r().getValue(), identityV3$UserProfile.m11971x().getValue(), identityV3$UserProfile.m11963p().getValue(), identityV3$UserProfile.m11962o().getValue(), identityV3$UserProfile.m11966s().getValue(), identityV3$UserProfile.m11967t().getValue(), identityV3$UserProfile.m11969v().getValue());
    }

    /* JADX INFO: renamed from: b */
    public final Single m86359b(String str) {
        return m86360c(str).firstOrError().map(d7f0.f46161b1).map(ket.f121953S0).onErrorReturn(new b93(str, 2));
    }

    /* JADX INFO: renamed from: c */
    public final Observable m86360c(String str) {
        if (wl51.m88460J0(str)) {
            throw new IllegalStateException("Parameter 'username' MUST NOT be empty");
        }
        ja10 ja10VarM97821p = GetProfilesRequest.m97821p();
        ja10VarM97821p.m52776q(str);
        return this.f244452a.m56115G((GetProfilesRequest) ja10VarM97821p.build()).switchMap(new C1868fp(this, 1));
    }

    /* JADX INFO: renamed from: d */
    public final Observable m86361d(String str) {
        return Observable.combineLatest(m86360c(str).map(let.f132696S0).map(net.f153080R0).onErrorReturnItem(new usk(null)), Observable.just(Boolean.TRUE).delay(100L, TimeUnit.MILLISECONDS, this.f244453b).startWithItem(Boolean.FALSE), oet.f164534S0).filter(b5v.f23711S0).map(new d7f1(str, 3)).distinctUntilChanged();
    }

    /* JADX INFO: renamed from: e */
    public final Observable m86362e(List list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("Parameter 'usernames' MUST contain at least one string");
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (wl51.m88460J0((String) it.next())) {
                    throw new IllegalStateException("All usernames in passed list MUST NOT be empty");
                }
            }
        }
        ja10 ja10VarM97821p = GetProfilesRequest.m97821p();
        ja10VarM97821p.m52775m(list);
        return this.f244452a.m56115G((GetProfilesRequest) ja10VarM97821p.build()).switchMap(new it9(this, 19));
    }
}
