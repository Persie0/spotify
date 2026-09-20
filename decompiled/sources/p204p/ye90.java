package p204p;

import android.view.View;
import androidx.car.app.model.Alert;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.data.cache.room.MessagesDatabase_Impl;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ye90 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f271942a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f271943b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ye90(Object obj, int i) {
        super(0);
        this.f271942a = i;
        this.f271943b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v83, types: [p.eh00, p.qe70] */
    @Override // p204p.eh00
    public final Object invoke() {
        Observable observableM42227g;
        Observable observableObserveOn;
        Observable observableFlatMapSingle;
        ConnectableObservable connectableObservableReplay;
        switch (this.f271942a) {
            case 0:
                ze90 ze90Var = (ze90) this.f271943b;
                fnk0 fnk0Var = ze90Var.f281978p;
                return (fnk0Var == null || (observableM42227g = fnk0Var.m42227g()) == null || (observableObserveOn = observableM42227g.observeOn(Schedulers.f10370c)) == null || (observableFlatMapSingle = observableObserveOn.flatMapSingle(new csy(ze90Var, 19))) == null || (connectableObservableReplay = observableFlatMapSingle.replay(1)) == null) ? Observable.never() : connectableObservableReplay.m23778f();
            case 1:
                return (z9j0) ((qo90) this.f271943b).f190869h.get();
            case 2:
                return (upk) ((ljx0) this.f271943b).f134173j.get(qpv0.f191387a.mo54112b(upk.class));
            case 3:
                return bzf1.m31021m((lqi0) ((ayb0) this.f271943b).f21188c.getValue());
            case 4:
                szc0 szc0Var = (szc0) this.f271943b;
                if (!szc0Var.f215478p.m93539b()) {
                    ((ck2) szc0Var.f215468f).m33062S();
                }
                szc0Var.f215472j.m63782a(bda.f26063c);
                return w2a1.f247311a;
            case 5:
                l6d0 l6d0Var = (l6d0) this.f271943b;
                pp70 pp70Var = l6d0Var.f130335f;
                pp70Var.f179930i = 0;
                qqi0 qqi0VarM59649z = pp70Var.f179922a.m59649z();
                Object[] objArr = qqi0VarM59649z.f191608a;
                int i = qqi0VarM59649z.f191610c;
                for (int i2 = 0; i2 < i; i2++) {
                    l6d0 l6d0Var2 = ((lp70) objArr[i2]).f135676d1.f179937p;
                    l6d0Var2.f130339h = l6d0Var2.f130341i;
                    l6d0Var2.f130341i = Alert.DURATION_SHOW_INDEFINITELY;
                    l6d0Var2.f130318R0 = false;
                    if (l6d0Var2.f130344k1 == 2) {
                        l6d0Var2.f130344k1 = 3;
                    }
                }
                lp70 lp70Var = pp70Var.f179922a;
                lp70 lp70Var2 = pp70Var.f179922a;
                qqi0 qqi0VarM59649z2 = lp70Var.m59649z();
                Object[] objArr2 = qqi0VarM59649z2.f191608a;
                int i3 = qqi0VarM59649z2.f191610c;
                for (int i4 = 0; i4 < i3; i4++) {
                    ((lp70) objArr2[i4]).f135676d1.f179937p.f130322V0.f239384d = false;
                }
                if (l6d0Var.mo49597p().f44837X) {
                    pqi0 pqi0Var = (pqi0) lp70Var2.m59638o();
                    int size = pqi0Var.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        ((lp70) pqi0Var.get(i5)).f135674c1.f263386d.f44837X = true;
                    }
                }
                l6d0Var.mo49597p().mo30043v0().mo27119a();
                if (l6d0Var.mo49597p().f44837X) {
                    pqi0 pqi0Var2 = (pqi0) lp70Var2.m59638o();
                    int size2 = pqi0Var2.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        ((lp70) pqi0Var2.get(i6)).f135674c1.f263386d.f44837X = false;
                    }
                }
                qqi0 qqi0VarM59649z3 = lp70Var2.m59649z();
                Object[] objArr3 = qqi0VarM59649z3.f191608a;
                int i7 = qqi0VarM59649z3.f191610c;
                for (int i8 = 0; i8 < i7; i8++) {
                    lp70 lp70Var3 = (lp70) objArr3[i8];
                    pp70 pp70Var2 = lp70Var3.f135676d1;
                    if (pp70Var2.f179937p.f130339h != lp70Var3.m59646w()) {
                        lp70Var2.m59613O();
                        lp70Var2.m59601C();
                        if (lp70Var3.m59646w() == Integer.MAX_VALUE) {
                            if (pp70Var2.f179924c || hxg1.m49011x(lp70Var3)) {
                                i3b0 i3b0Var = pp70Var2.f179938q;
                                wj50.m88279p(i3b0Var);
                                i3b0Var.m49592j0(false);
                            }
                            pp70Var2.f179937p.m58328k0();
                        }
                    }
                }
                qqi0 qqi0VarM59649z4 = lp70Var2.m59649z();
                Object[] objArr4 = qqi0VarM59649z4.f191608a;
                int i9 = qqi0VarM59649z4.f191610c;
                for (int i10 = 0; i10 < i9; i10++) {
                    mp70 mp70Var = ((lp70) objArr4[i10]).f135676d1.f179937p.f130322V0;
                    mp70Var.f239385e = mp70Var.f239384d;
                }
                return w2a1.f247311a;
            case 6:
                return u4i.m82331b((u4i) this.f271943b).m23360y(r2z.f195261M0).m23331J(s2z.f205100M0).m23356t(Functions.f7225a);
            case 7:
                ((ind0) this.f271943b).mo36150a();
                return w2a1.f247311a;
            case 8:
                return h1k.m46460a((h1k) this.f271943b);
            case 9:
                return ((a9i0) this.f271943b).m25127i();
            case 10:
                return new nub((MessagesDatabase_Impl) this.f271943b);
            case 11:
                return new SchedulerWorkRunner((Scheduler) this.f271943b);
            case 12:
                pfi0 pfi0Var = (pfi0) this.f271943b;
                return pfi0Var.f177090i.mo38696a(pfi0Var.f177082a, pfi0Var.f177083b, pfi0Var.f177084c, pfi0Var.m69808j().f145378h);
            case 13:
                return ((Observable) ((tfi0) this.f271943b).f219995X1.getValue()).map(r101.f194676h1).distinctUntilChanged();
            case 14:
                ((pri0) this.f271943b).f180609a.mo47345e();
                return w2a1.f247311a;
            case 15:
                List list = (List) ((rv41) this.f271943b).getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (wj50.m88271j(((uxi0) obj).f234936b.m54793e(), "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 16:
                return Boolean.valueOf(((e3j0) ((s8j0) this.f271943b).f206661g).mo37646j());
            case 17:
                ((qe70) this.f271943b).invoke();
                return w2a1.f247311a;
            case 18:
                bnj0 bnj0Var = ((bnj0) this.f271943b).f28854Q0;
                if (bnj0Var != null) {
                    bnj0Var.m30032n1();
                }
                return w2a1.f247311a;
            case 19:
                mck0.m61467i1((View) this.f271943b);
                return w2a1.f247311a;
            case 20:
                return efe.m38724b((efe) this.f271943b).mo24361d();
            case 21:
                return ((tek0) this.f271943b).f219735f.m94844a(qrm0.f191884b, 1);
            case 22:
                NpvWidgetProvider npvWidgetProvider = (NpvWidgetProvider) this.f271943b;
                return npvWidgetProvider.f6508e.mo25796a(new ccj0(npvWidgetProvider, 23));
            case 23:
                return (wi7) ((s8j0) this.f271943b).f206655a;
            case 24:
                return ((lji) this.f271943b).mo56602e();
            case 25:
                return ((mji) this.f271943b).f144264f;
            case 26:
                return ((jx70) this.f271943b).f117016r1;
            case 27:
                return ((afq0) this.f271943b).mo25827d();
            case 28:
                return ((nj7) this.f271943b).mo61933d();
            default:
                return ((uzz0) this.f271943b).f235781g1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ye90(eh00 eh00Var) {
        super(0);
        this.f271942a = 17;
        this.f271943b = (qe70) eh00Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye90(mck0 mck0Var, View view) {
        super(0);
        this.f271942a = 19;
        this.f271943b = view;
    }
}
