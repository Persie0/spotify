package p204p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.encoremobile.tooltip.TooltipContainer;
import com.spotify.music.R;
import java.util.HashSet;

/* JADX INFO: loaded from: classes10.dex */
public abstract class n09 implements z281 {

    /* JADX INFO: renamed from: b */
    public View f148938b;

    /* JADX INFO: renamed from: d */
    public final m500 f148940d;

    /* JADX INFO: renamed from: e */
    public View f148941e;

    /* JADX INFO: renamed from: a */
    public final HashSet f148937a = new HashSet(0);

    /* JADX INFO: renamed from: c */
    public final boolean f148939c = true;

    /* JADX INFO: renamed from: f */
    public qe70 f148942f = z67.f279717L0;

    /* JADX INFO: renamed from: g */
    public final n10 f148943g = new n10(this, 15);

    public n09(m500 m500Var) {
        this.f148940d = m500Var;
    }

    @Override // p204p.z281
    /* JADX INFO: renamed from: a */
    public Integer mo57572a() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m63298b(a381 a381Var) {
        this.f148937a.add(a381Var);
    }

    /* JADX INFO: renamed from: c */
    public final void m63299c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mo57573g(), viewGroup, false);
        this.f148938b = viewInflate;
        viewInflate.getClass();
        viewGroup.addView(this.f148938b);
        View view = this.f148938b;
        this.f148941e = view;
        mo57574j(view);
        view.setOnClickListener(new y10(this, 9));
        TooltipContainer tooltipContainerM9684c = TooltipContainer.m9684c(this.f148940d);
        tooltipContainerM9684c.setOnTouchListener(new f87(1, tooltipContainerM9684c, this));
        view.postDelayed(this.f148943g, 12000L);
        if (this.f148939c) {
            Integer numM63301e = m63301e();
            if (numM63301e.intValue() > 0) {
                dt71.m36829u(this.f148938b, numM63301e.intValue());
            } else {
                dt71.m36829u(this.f148938b, this.f148938b.getResources().getDimensionPixelSize(R.dimen.encore_tooltip_corner_radius));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final Integer m63300d() {
        return Integer.valueOf(this.f148940d.getColor(R.color.reinvent_free_tooltip_background));
    }

    /* JADX INFO: renamed from: e */
    public final Integer m63301e() {
        return Integer.valueOf(this.f148940d.getResources().getDimensionPixelSize(R.dimen.reinvent_free_tooltip_radius));
    }

    /* JADX INFO: renamed from: f */
    public final void m63302f(ViewGroup viewGroup) {
        View view = this.f148938b;
        if (view != null) {
            viewGroup.removeView(view);
            this.f148938b = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo57573g();

    /* JADX INFO: renamed from: h */
    public final boolean m63303h() {
        m500 m500Var = this.f148940d;
        return (e0b1.m37490b(m500Var) || e0b1.m37489a(m500Var)) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public final void m63304i() {
        View view = this.f148941e;
        if (view == null) {
            wj50.m88260d0("rootView");
            throw null;
        }
        view.removeCallbacks(this.f148943g);
        HashSet<a381> hashSet = this.f148937a;
        if (hashSet.isEmpty()) {
            return;
        }
        for (a381 a381Var : hashSet) {
            int i = a381Var.f11899a;
            Object obj = a381Var.f11900b;
            switch (i) {
                case 0:
                    ((TooltipContainer) obj).m9686b();
                    break;
                default:
                    ((eh00) obj).invoke();
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo57574j(View view);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final void m63305k(eh00 eh00Var) {
        this.f148942f = (qe70) eh00Var;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m63306l() {
        return this.f148939c;
    }
}
