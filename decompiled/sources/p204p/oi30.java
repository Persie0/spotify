package p204p;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.legacyglue.pasteview.PasteViewLayoutParamHelper;
import com.spotify.music.R;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class oi30 extends oj30 {

    /* JADX INFO: renamed from: b */
    public final li30 f165657b;

    /* JADX INFO: renamed from: c */
    public final ti30 f165658c;

    /* JADX INFO: renamed from: d */
    public final mi30 f165659d;

    /* JADX INFO: renamed from: e */
    public fk30 f165660e;

    /* JADX INFO: renamed from: f */
    public mqr f165661f;

    public oi30(ViewGroup viewGroup, sk30 sk30Var, boolean z) {
        RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
        recyclerView.setLayoutParams(PasteViewLayoutParamHelper.generateMatchParentLayoutParams(viewGroup.getContext(), viewGroup));
        super(recyclerView);
        recyclerView.setNestedScrollingEnabled(false);
        Context context = recyclerView.getContext();
        li30 li30Var = new li30(new skp(new yaz(sk30Var.f209991d, 12), new ei10(context, z)), context.getResources().getInteger(R.integer.hugs_grid_columns));
        this.f165657b = li30Var;
        recyclerView.setLayoutManager(li30Var);
        ti30 ti30Var = new ti30(sk30Var, null);
        this.f165658c = ti30Var;
        recyclerView.setHasFixedSize(false);
        if (viewGroup instanceof RecyclerView) {
            RecyclerView recyclerView2 = (RecyclerView) viewGroup;
            if (recyclerView2.getAdapter() instanceof ti30) {
                recyclerView.setRecycledViewPool(recyclerView2.getRecycledViewPool());
            }
        }
        recyclerView.setLayoutFrozen(false);
        recyclerView.m1037w0(ti30Var, true, false);
        recyclerView.m1016k0(true);
        recyclerView.requestLayout();
        this.f165659d = new mi30(this);
        recyclerView.addOnAttachStateChangeListener(new ay1(this, 14));
    }

    @Override // p204p.oj30
    /* JADX INFO: renamed from: a */
    public void mo32903a(fk30 fk30Var, sk30 sk30Var, mqr mqrVar) {
        this.f165660e = fk30Var;
        this.f165661f = mqrVar;
        List listChildren = fk30Var.children();
        ti30 ti30Var = this.f165658c;
        ti30Var.m80898B(listChildren);
        ui30 ui30Var = ti30Var.f220545f;
        ni30 ni30Var = (ni30) mqrVar.m62585d(fk30Var);
        li30 li30Var = this.f165657b;
        if (ni30Var != null) {
            ui30Var.m83175r(ni30Var.f154168a, (WeakHashMap) ui30Var.f146343b);
            li30Var.mo961x0(ni30Var.f154169b);
        } else {
            ui30Var.m83175r(null, (WeakHashMap) ui30Var.f146343b);
            li30Var.mo962x1(0, 0);
        }
        ti30Var.m47712h();
    }

    @Override // p204p.oj30
    /* JADX INFO: renamed from: b */
    public final void mo32904b(int... iArr) {
        frz0.m42534s((RecyclerView) this.f165949a, iArr);
    }
}
