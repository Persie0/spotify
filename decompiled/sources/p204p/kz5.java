package p204p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.facepile.FacePileView;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.ReplaySubject;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class kz5 implements Connectable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f128011a;

    /* JADX INFO: renamed from: b */
    public final Object f128012b;

    /* JADX INFO: renamed from: c */
    public final Object f128013c;

    /* JADX INFO: renamed from: d */
    public final Object f128014d;

    /* JADX INFO: renamed from: e */
    public Object f128015e;

    /* JADX INFO: renamed from: f */
    public Object f128016f;

    /* JADX INFO: renamed from: g */
    public Object f128017g;

    public kz5(r06 r06Var, z9j0 z9j0Var, xqb xqbVar, Scheduler scheduler, List list) {
        this.f128011a = 0;
        this.f128012b = r06Var;
        this.f128013c = z9j0Var;
        this.f128014d = xqbVar;
        this.f128015e = scheduler;
        this.f128016f = list;
        this.f128017g = new lwr();
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        int iM88463M0;
        switch (this.f128011a) {
            case 0:
                List<String> list = (List) this.f128016f;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                for (String strSubstring : list) {
                    int i = 0;
                    for (int i2 = 0; i2 < strSubstring.length(); i2++) {
                        if (strSubstring.charAt(i2) == ':') {
                            i++;
                        }
                    }
                    if (i > 2 && (iM88463M0 = wl51.m88463M0(strSubstring, ":", 0, 6)) != -1) {
                        strSubstring = strSubstring.substring(0, iM88463M0);
                    }
                    arrayList.add(strSubstring);
                }
                ((lwr) this.f128017g).m60127a(((r06) this.f128012b).m74365a(arrayList).map(new az1(this, 23)).observeOn((Scheduler) this.f128015e).subscribe(new C1784dn(consumer, 7)));
                return new C2185np(this, 6);
            case 1:
                return new C1747cn(5, this, consumer);
            case 2:
                return new v2f(this, consumer);
            case 3:
                lwr lwrVar = (lwr) this.f128017g;
                Flowable flowableM23343X = ((Flowable) this.f128012b).m23360y(r4z.f195882Q0).m23356t(j5z.f109144O0).m23343X(new m680(this, 26));
                flowableM23343X.getClass();
                lwrVar.m60127a(flowableM23343X.m23356t(Functions.f7225a).m23342W((Scheduler) this.f128013c).m23332L((Scheduler) this.f128014d).subscribe(new qw90(consumer, 7)));
                return new rm90(this, 11);
            case 4:
                return new nak0(0, consumer, this);
            case 5:
                return new cgv0(this, consumer);
            default:
                this.f128015e = consumer;
                return new rm90(this, 27);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m57732a() {
        Object value = vqg1.m86217B(((efk0) this.f128015e).f59061a).getValue();
        yek0 yek0Var = value instanceof yek0 ? (yek0) value : null;
        return yek0Var != null && yek0Var.f272005a;
    }

    public kz5(LayoutInflater layoutInflater, ViewGroup viewGroup, e940 e940Var) {
        this.f128011a = 1;
        this.f128012b = e940Var;
        View viewInflate = layoutInflater.inflate(R.layout.blend_invitation_view, viewGroup, false);
        this.f128013c = viewInflate;
        this.f128014d = (Button) viewInflate.findViewById(R.id.button_primary);
        this.f128015e = (Button) viewInflate.findViewById(R.id.button_dismiss);
        this.f128016f = (ProgressBar) viewInflate.findViewById(R.id.loading);
        this.f128017g = (FacePileView) viewInflate.findViewById(R.id.face_pile);
        viewInflate.setVisibility(8);
    }

    public kz5(bse1 bse1Var, etz etzVar, ReplaySubject replaySubject, z9j0 z9j0Var, qkx0 qkx0Var, Scheduler scheduler) {
        this.f128011a = 5;
        this.f128012b = bse1Var;
        this.f128014d = etzVar;
        this.f128016f = replaySubject;
        this.f128013c = z9j0Var;
        this.f128017g = qkx0Var;
        this.f128015e = scheduler;
    }

    public kz5(bwt0 bwt0Var, ob01 ob01Var, gvt0 gvt0Var) {
        this.f128011a = 6;
        this.f128012b = bwt0Var;
        this.f128013c = ob01Var;
        this.f128014d = gvt0Var;
    }

    public kz5(kv91 kv91Var, f9k0 f9k0Var, oge0 oge0Var, efk0 efk0Var, vbu0 vbu0Var) {
        this.f128011a = 4;
        this.f128012b = kv91Var;
        this.f128013c = f9k0Var;
        this.f128014d = oge0Var;
        this.f128015e = efk0Var;
        this.f128016f = vbu0Var;
    }

    public kz5(ycc yccVar, j0f j0fVar, C2223op c2223op, fcu fcuVar) {
        this.f128011a = 2;
        this.f128012b = yccVar;
        this.f128013c = j0fVar;
        this.f128014d = c2223op;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) yccVar.f271453b;
        this.f128015e = coordinatorLayout;
        ovf ovfVarMo26174a = fcuVar.mo26174a(null);
        this.f128016f = ovfVarMo26174a;
        this.f128017g = new PublishSubject();
        RecyclerView recyclerView = (RecyclerView) yccVar.f271456e;
        coordinatorLayout.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter(j0fVar);
        mjv0 itemAnimator = recyclerView.getItemAnimator();
        sc21 sc21Var = itemAnimator instanceof sc21 ? (sc21) itemAnimator : null;
        if (sc21Var != null) {
            sc21Var.f207636g = false;
        }
        ((CoordinatorLayout) yccVar.f271455d).addView((View) c2223op.f167726g, 0);
        p3h1.m69032r(recyclerView, jl9.f113539Y);
        psg1.m70832H((View) yccVar.f271454c, (ConstraintLayout) ((za7) ovfVarMo26174a).f280995d);
        new qv50(new ed61(recyclerView.getContext())).m73963i(recyclerView);
    }

    public kz5(Flowable flowable, List list, Scheduler scheduler, Scheduler scheduler2, Scheduler scheduler3) {
        this.f128011a = 3;
        this.f128012b = flowable;
        this.f128016f = list;
        this.f128015e = scheduler;
        this.f128013c = scheduler2;
        this.f128014d = scheduler3;
        this.f128017g = new lwr();
    }
}
