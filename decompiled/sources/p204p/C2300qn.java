package p204p;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoreconsumermobile.elements.loadingdots.ThreeDotsLoaderView;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.C1044a;
import com.spotify.mobius.functions.Consumer;
import com.spotify.music.R;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: p.qn */
/* JADX INFO: loaded from: classes4.dex */
public final class C2300qn implements Connectable, clc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f190444a;

    /* JADX INFO: renamed from: b */
    public final Object f190445b;

    /* JADX INFO: renamed from: c */
    public Object f190446c;

    public /* synthetic */ C2300qn(int i, Object obj, Object obj2) {
        this.f190444a = i;
        this.f190445b = obj;
        this.f190446c = obj2;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        int i = this.f190444a;
        fbk fbkVar = null;
        int i2 = 20;
        int i3 = 13;
        int i4 = 3;
        int i5 = 1;
        int i6 = 0;
        Object obj = this.f190445b;
        switch (i) {
            case 0:
                return new C1747cn(i5, (C1747cn) ((C1820en) this.f190446c).mo3269P(consumer), this);
            case 1:
                n5q n5qVar = xsr.f265651a;
                rb20 rb20Var = pvb0.f181680a;
                uf60 uf60VarM73202g = qlg1.m73202g();
                rb20Var.getClass();
                return new mk3(new rlv0(), kk40.m56661c(opo.m67570t(rb20Var, uf60VarM73202g)), new rlv0(), consumer, (ltx0) obj, (gk3) this.f190446c);
            case 2:
                hb11 hb11VarM52092t = j0g1.m52092t(0, 1, 0, 5);
                return new C1747cn(6, x0h1.m89578u(kk40.m56661c((juk) obj), null, 0, new xha((jna) this.f190446c, hb11VarM52092t, consumer, null, 3), 3), hb11VarM52092t);
            case 3:
                return new C2185np(this, i2);
            case 4:
                return ((m4w) obj).mo3269P(consumer);
            case 5:
                hb11 hb11VarM52092t2 = j0g1.m52092t(0, 1, 0, 5);
                Object obj2 = new Object();
                nlv0 nlv0Var = new nlv0();
                return new zex(obj2, nlv0Var, x0h1.m89578u(kk40.m56661c((juk) obj), null, 0, new gnq(8, (nex) this.f190446c, hb11VarM52092t2, obj2, nlv0Var, consumer, (fbk) null), 3), hb11VarM52092t2);
            case 6:
                c9k c9kVarM56661c = kk40.m56661c(opo.m67570t(njg1.m64613f(), (luk) this.f190446c));
                x0h1.m89578u(c9kVarM56661c, null, 0, new dmx(this, consumer, fbkVar, i5), 3);
                return new fmx(c9kVarM56661c);
            case 7:
                return new v2f(new AtomicBoolean(false), kk40.m56661c(opo.m67570t(njg1.m64613f(), (luk) this.f190446c)), this, consumer, 2);
            case 8:
                return new C1747cn(i2, this, consumer);
            case 9:
                return new fmx(this, consumer);
            case 10:
                Connectable connectableMo24834a = ((wsa0) obj).mo24834a();
                if (connectableMo24834a == null) {
                    return new C1747cn(xph0.f264656Z, sfe0.f208550R0);
                }
                Class cls = (Class) this.f190446c;
                Connection connectionMo3269P = connectableMo24834a.mo3269P(new eo2(consumer, 13));
                return new C1747cn(new sxh0(i6, cls, connectionMo3269P), new ooa0(0, connectionMo3269P, Connection.class, "dispose", "dispose()V", 0, 0, 12));
            case 11:
                return new nak0(8, (z9j0) obj, (c851) this.f190446c);
            case 12:
                return new jc01(1, ((PublishSubject) obj).subscribe(new qw90(consumer, 19)));
            case 13:
                return new fmx(this, consumer, (byte) 0);
            case 14:
                return new nak0(i3, ((C1044a) obj).mo3269P(consumer), (he90) this.f190446c);
            default:
                this.f190446c = consumer;
                return new gk81(this, i4);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73311a(bs31 bs31Var) {
        p7x0 p7x0Var = (p7x0) this.f190446c;
        ur31 ur31VarM78478e = sli0.m78478e(bs31Var.f30227a);
        List list = bs31Var.f30228b;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(sli0.m78478e((wr31) it.next()));
        }
        p7x0Var.mo25060a(new kpe1(new vne1(arrayList, ur31VarM78478e)), null);
    }

    public View getRoot() {
        return (ConstraintLayout) this.f190446c;
    }

    @Override // p204p.clc1
    public View getView() {
        return (View) ((wg61) this.f190446c).getValue();
    }

    public C2300qn(v8e1 v8e1Var) {
        this.f190444a = 15;
        this.f190445b = jag1.m52819d(v8e1Var);
    }

    public C2300qn(nh61 nh61Var, C1820en c1820en) {
        this.f190444a = 0;
        this.f190445b = nh61Var;
        this.f190446c = c1820en;
        ((EncoreTextView) nh61Var.f153887e).setVisibility(4);
        ((EncoreTextView) nh61Var.f153885c).setVisibility(4);
        RecyclerView recyclerView = (RecyclerView) nh61Var.f153886d;
        recyclerView.m1011i(new y5c(4));
        recyclerView.setAdapter(c1820en);
        c1820en.mo47719v(new C2262pn(this, 0));
    }

    public C2300qn(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f190444a = 8;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_graduation_start, viewGroup, false);
        int i = R.id.graduation_start_label;
        TextView textView = (TextView) vie1.m85629k(viewInflate, R.id.graduation_start_label);
        if (textView != null) {
            i = R.id.progress_view;
            ThreeDotsLoaderView threeDotsLoaderView = (ThreeDotsLoaderView) vie1.m85629k(viewInflate, R.id.progress_view);
            if (threeDotsLoaderView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.f190445b = new xst(constraintLayout, textView, threeDotsLoaderView, 26);
                this.f190446c = constraintLayout;
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2300qn(gh00 gh00Var, luk lukVar) {
        this.f190444a = 7;
        this.f190445b = (qe70) gh00Var;
        this.f190446c = lukVar;
    }

    public C2300qn(m4w m4wVar, bwt0 bwt0Var, Bundle bundle) {
        this.f190444a = 4;
        this.f190445b = m4wVar;
        this.f190446c = new wg61(new d4w(bwt0Var, 0));
        if (bundle != null) {
            m4wVar.f140051f = bundle.getParcelable("EpisodeLimitsPageViewBinderImpl.savedState");
        }
    }

    public C2300qn(rmm0 rmm0Var) {
        this.f190444a = 12;
        this.f190445b = new PublishSubject();
        this.f190446c = rmm0Var.mo29877i().mo27151a(xl21.f263010c, new wh1(this, 29));
    }
}
