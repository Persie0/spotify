package p204p;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.facepile.FaceView;
import com.spotify.music.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class jo6 extends hjv0 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f114334d;

    /* JADX INFO: renamed from: e */
    public Object f114335e;

    /* JADX INFO: renamed from: f */
    public Object f114336f;

    /* JADX INFO: renamed from: A */
    public Object m53864A(int i) {
        e60 e60Var = (e60) this.f114335e;
        if (i < ((ArrayList) e60Var.f56509f).size()) {
            return ((ArrayList) e60Var.f56509f).get(i);
        }
        return null;
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: d */
    public int mo47711d(hjv0 hjv0Var, dkv0 dkv0Var, int i) {
        switch (this.f114334d) {
            case 0:
                return hjv0Var.mo47711d(hjv0Var, dkv0Var, i);
            default:
                return super.mo47711d(hjv0Var, dkv0Var, i);
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: e */
    public final int mo1617e() {
        switch (this.f114334d) {
            case 0:
                return ((hjv0) this.f114336f).mo1617e();
            case 1:
                return ((ArrayList) ((e60) this.f114335e).f56509f).size();
            case 2:
                return 2;
            case 3:
                return ((ArrayList) this.f114335e).size();
            case 4:
                return ((List) this.f114335e).size();
            default:
                return 1;
        }
    }

    public boolean equals(Object obj) {
        switch (this.f114334d) {
            case 0:
                return ((hjv0) this.f114336f).equals(obj);
            default:
                return super.equals(obj);
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: f */
    public long mo1618f(int i) {
        switch (this.f114334d) {
            case 0:
                return ((hjv0) this.f114336f).mo1618f(i);
            default:
                return super.mo1618f(i);
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: g */
    public int mo28437g(int i) {
        switch (this.f114334d) {
            case 0:
                return ((hjv0) this.f114336f).mo28437g(i);
            case 1:
                return ((e60) this.f114335e).m37854l(i);
            default:
                return super.mo28437g(i);
        }
    }

    public int hashCode() {
        switch (this.f114334d) {
            case 0:
                return ((hjv0) this.f114336f).hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: m */
    public void mo28858m(RecyclerView recyclerView) {
        switch (this.f114334d) {
            case 0:
                ((tmq) this.f114335e).m81145a(recyclerView);
                ((hjv0) this.f114336f).mo28858m(recyclerView);
                break;
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: n */
    public final void mo1619n(int i, dkv0 dkv0Var) {
        String str;
        Drawable drawable;
        Drawable drawable2 = null;
        switch (this.f114334d) {
            case 0:
                ((hjv0) this.f114336f).mo1619n(i, dkv0Var);
                return;
            case 1:
                ((e60) this.f114335e).m37846d((rxf) dkv0Var, i, null);
                return;
            case 2:
                moc0 moc0Var = (moc0) dkv0Var;
                TextView textView = moc0Var.f145649T0;
                tw80 tw80Var = moc0Var.f145648S0;
                if (i == 0) {
                    str = (String) tw80Var.f224371g;
                } else {
                    if (i != 1) {
                        tw80Var.getClass();
                        throw new IllegalArgumentException("Unsupported view type");
                    }
                    str = (String) tw80Var.f224372h;
                }
                textView.setText(str);
                ImageView imageView = moc0Var.f145650U0;
                m500 m500Var = (m500) ((WeakReference) tw80Var.f224373i).get();
                if (m500Var != null && (drawable = m500Var.getDrawable(R.drawable.encore_icon_ban)) != null) {
                    drawable.setTint(-1);
                    drawable2 = drawable;
                }
                imageView.setImageDrawable(drawable2);
                moc0Var.f50039a.setOnClickListener(new f79(moc0Var, i, 2));
                return;
            case 3:
                lce0 lce0Var = (lce0) dkv0Var;
                TextView textView2 = lce0Var.f131911U0;
                ArrayList arrayList = (ArrayList) this.f114335e;
                k8e0 k8e0Var = (k8e0) arrayList.get(i);
                FaceView faceView = lce0Var.f131910T0;
                e940 e940Var = (e940) this.f114336f;
                j6y j6yVar = new j6y(k8e0Var.f120313b, k8e0Var.f120312a, null, null);
                int i2 = FaceView.f3814f;
                faceView.m9683h(e940Var, j6yVar, null);
                if (k8e0Var.f120315d) {
                    textView2.setText(lce0Var.f131909S0.getString(R.string.premium_plan_card_you));
                    lce0Var.f131913W0.setVisibility(0);
                } else {
                    textView2.setText(((k8e0) arrayList.get(i)).f120312a);
                }
                lce0Var.f131912V0.setText(((k8e0) arrayList.get(i)).f120318g);
                return;
            case 4:
                fys0 fys0Var = (fys0) dkv0Var;
                String str2 = (String) ((List) this.f114335e).get(i);
                p6e p6eVar = fys0Var.f74838S0;
                p6eVar.mo2821c(new on2(fys0Var.f74839T0, str2, i, 26));
                p6eVar.setText(str2);
                return;
            default:
                ((u7z0) dkv0Var).f227773S0.mo2820d(new q7z0((String) this.f114336f));
                return;
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: o */
    public void mo47717o(dkv0 dkv0Var, int i, List list) {
        switch (this.f114334d) {
            case 0:
                ((hjv0) this.f114336f).mo47717o(dkv0Var, i, list);
                break;
            default:
                super.mo47717o(dkv0Var, i, list);
                break;
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: p */
    public final dkv0 mo1620p(int i, ViewGroup viewGroup) {
        switch (this.f114334d) {
            case 0:
                return ((hjv0) this.f114336f).mo1620p(i, viewGroup);
            case 1:
                return ((e60) this.f114335e).m37848f(i, viewGroup, (w8j) this.f114336f);
            case 2:
                return new moc0(((LayoutInflater) this.f114335e).inflate(R.layout.optout_menu_item, viewGroup, false), (tw80) this.f114336f);
            case 3:
                View viewM25591c = adn.m25591c(viewGroup, R.layout.plan_details_card_plan_member_row, viewGroup, false);
                wj50.m88279p(viewM25591c);
                return new lce0(viewM25591c);
            case 4:
                return new fys0(this, new p6e(viewGroup.getContext(), 0));
            default:
                return new u7z0(((gju) this.f114335e).mo26174a(null));
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: q */
    public void mo28696q(RecyclerView recyclerView) {
        switch (this.f114334d) {
            case 0:
                ((hjv0) this.f114336f).mo28696q(recyclerView);
                ((tmq) this.f114335e).m81145a(null);
                break;
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: r */
    public boolean mo47718r(dkv0 dkv0Var) {
        switch (this.f114334d) {
            case 0:
                return ((hjv0) this.f114336f).mo47718r(dkv0Var);
            default:
                return super.mo47718r(dkv0Var);
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: s */
    public void mo31053s(dkv0 dkv0Var) {
        switch (this.f114334d) {
            case 0:
                ((hjv0) this.f114336f).mo31053s(dkv0Var);
                break;
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: t */
    public void mo31054t(dkv0 dkv0Var) {
        switch (this.f114334d) {
            case 0:
                ((hjv0) this.f114336f).mo31054t(dkv0Var);
                break;
        }
    }

    public String toString() {
        switch (this.f114334d) {
            case 0:
                return ((hjv0) this.f114336f).toString();
            default:
                return super.toString();
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: u */
    public void mo28697u(dkv0 dkv0Var) {
        switch (this.f114334d) {
            case 0:
                ((hjv0) this.f114336f).mo28697u(dkv0Var);
                break;
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: v */
    public void mo47719v(jjv0 jjv0Var) {
        switch (this.f114334d) {
            case 0:
                ((hjv0) this.f114336f).mo47719v(jjv0Var);
                break;
            default:
                super.mo47719v(jjv0Var);
                break;
        }
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: z */
    public void mo47722z(jjv0 jjv0Var) {
        switch (this.f114334d) {
            case 0:
                ((hjv0) this.f114336f).mo47722z(jjv0Var);
                break;
            default:
                super.mo47722z(jjv0Var);
                break;
        }
    }

    public /* synthetic */ jo6(int i, Object obj, Object obj2) {
        this.f114334d = i;
        this.f114335e = obj;
        this.f114336f = obj2;
    }
}
