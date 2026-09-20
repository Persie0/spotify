package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.icons.IconExclamationCircle;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import com.spotify.music.R;
import com.spotify.notifications.models.preferences.Item$Group;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class cdc implements u9m0, Connectable {

    /* JADX INFO: renamed from: X */
    public final bbg0 f36855X;

    /* JADX INFO: renamed from: Y */
    public MobiusLoop.Controller f36856Y;

    /* JADX INFO: renamed from: Z */
    public bxb f36857Z;

    /* JADX INFO: renamed from: a */
    public final xcc f36858a;

    /* JADX INFO: renamed from: b */
    public final bcc f36859b;

    /* JADX INFO: renamed from: c */
    public final List f36860c;

    /* JADX INFO: renamed from: d */
    public final Bundle f36861d;

    /* JADX INFO: renamed from: e */
    public final boolean f36862e;

    /* JADX INFO: renamed from: f */
    public final eju f36863f;

    /* JADX INFO: renamed from: g */
    public final f2k0 f36864g;

    /* JADX INFO: renamed from: h */
    public final v1k0 f36865h;

    /* JADX INFO: renamed from: i */
    public final bvp f36866i;

    /* JADX INFO: renamed from: t */
    public final kv91 f36867t;

    public cdc(xcc xccVar, bcc bccVar, List list, Bundle bundle, boolean z, eju ejuVar, f2k0 f2k0Var, v1k0 v1k0Var, bvp bvpVar, kv91 kv91Var, bbg0 bbg0Var) {
        this.f36858a = xccVar;
        this.f36859b = bccVar;
        this.f36860c = list;
        this.f36861d = bundle;
        this.f36862e = z;
        this.f36863f = ejuVar;
        this.f36864g = f2k0Var;
        this.f36865h = v1k0Var;
        this.f36866i = bvpVar;
        this.f36867t = kv91Var;
        this.f36855X = bbg0Var;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        return new C2185np(this, 11);
    }

    @Override // p204p.u9m0
    /* JADX INFO: renamed from: c */
    public final void mo24481c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.categories_fragment, viewGroup, false);
        int i = R.id.disclaimer;
        TextView textView = (TextView) vie1.m85629k(viewInflate, R.id.disclaimer);
        if (textView != null) {
            i = R.id.language_selection_row;
            View viewM85629k = vie1.m85629k(viewInflate, R.id.language_selection_row);
            if (viewM85629k != null) {
                int i2 = R.id.error_icon;
                IconExclamationCircle iconExclamationCircle = (IconExclamationCircle) vie1.m85629k(viewM85629k, R.id.error_icon);
                if (iconExclamationCircle != null) {
                    i2 = R.id.subtitle;
                    TextView textView2 = (TextView) vie1.m85629k(viewM85629k, R.id.subtitle);
                    if (textView2 != null) {
                        i2 = R.id.title;
                        if (((TextView) vie1.m85629k(viewM85629k, R.id.title)) != null) {
                            x610 x610Var = new x610((ConstraintLayout) viewM85629k, iconExclamationCircle, textView2, 27);
                            i = R.id.permissions_card_view;
                            View viewM85629k2 = vie1.m85629k(viewInflate, R.id.permissions_card_view);
                            if (viewM85629k2 != null) {
                                i = R.id.recycler_view;
                                RecyclerView recyclerView = (RecyclerView) vie1.m85629k(viewInflate, R.id.recycler_view);
                                if (recyclerView != null) {
                                    bxb bxbVar = new bxb((NestedScrollView) viewInflate, textView, x610Var, viewM85629k2, recyclerView);
                                    recyclerView.setLayoutManager(new LinearLayoutManager(1));
                                    recyclerView.setAdapter(this.f36859b);
                                    recyclerView.setClipToPadding(false);
                                    p3h1.m69032r(recyclerView, jl9.f113550f);
                                    Bundle bundle = this.f36861d;
                                    if (bundle != null) {
                                        wq50 wq50Var = (wq50) bundle.getParcelable("SELECTED_GROUP_ITEM");
                                        if (wq50Var instanceof Item$Group) {
                                            String str = ((Item$Group) wq50Var).description;
                                            textView.setText(str);
                                            textView.setVisibility(str.length() > 0 ? 0 : 8);
                                        }
                                    }
                                    if (this.f36864g.f65203a.m74795j() && !this.f36865h.f236405a.m57999d(context)) {
                                        za7 za7Var = new za7((Context) this.f36863f.f60294b.f75987b, this.f36866i);
                                        da80 da80Var = (da80) za7Var.f280995d;
                                        psg1.m70832H(viewM85629k2, (CardView) da80Var.f46996b);
                                        String string = context.getString(R.string.permission_card_headline);
                                        String string2 = context.getString(R.string.permission_card_body);
                                        String string3 = context.getString(R.string.permission_card_button);
                                        ((TextView) da80Var.f46999e).setText(string);
                                        ((TextView) da80Var.f46997c).setText(string2);
                                        ((EncoreButton) da80Var.f46998d).setText(string3);
                                        ((CardView) da80Var.f46996b).setVisibility(0);
                                        za7Var.mo2821c(new wga(this, 20));
                                        this.f36867t.mo57449i(this.f36855X.mo24514e(), null);
                                        viewM85629k2.setVisibility(0);
                                    }
                                    this.f36857Z = bxbVar;
                                    zcc zccVar = new zcc(this.f36860c, eh70.f59512a, this.f36862e);
                                    xcc xccVar = this.f36858a;
                                    z9j0 z9j0Var = xccVar.f260193a;
                                    ahg0 ahg0Var = xccVar.f260195c;
                                    kv91 kv91Var = xccVar.f260196d;
                                    Scheduler scheduler = xccVar.f260197e;
                                    hol0 hol0Var = xccVar.f260200h;
                                    Scheduler scheduler2 = xccVar.f260198f;
                                    f2k0 f2k0Var = xccVar.f260201i;
                                    dwj0 dwj0Var = xccVar.f260202j;
                                    RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderM15658c = RxMobius.m15658c();
                                    subtypeEffectHandlerBuilderM15658c.m15662d(fcc.class, new ccc(ahg0Var, kv91Var, z9j0Var, f2k0Var.f65203a.m74792g()), scheduler);
                                    subtypeEffectHandlerBuilderM15658c.m15665g(gcc.class, new C2263po(5, hol0Var, scheduler2));
                                    subtypeEffectHandlerBuilderM15658c.m15665g(ecc.class, new C2263po(4, dwj0Var, scheduler2));
                                    this.f36856Y = Mobius.m15580b(klh.m56831c("NotificationCategories", Mobius.m15582d(wcc.f250015a, RxConnectables.m15653a(subtypeEffectHandlerBuilderM15658c.m15666h())).mo15596h(RxEventSources.m15655a(xccVar.f260194b.f111324a, xccVar.f260199g.f90109a.hide().map(u4g1.f226685M0)))), zccVar, vcc.f240104a, MainThreadWorkRunner.m15627a());
                                    return;
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM85629k.getResources().getResourceName(i2)));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // p204p.u9m0
    public final View getView() {
        bxb bxbVar = this.f36857Z;
        if (bxbVar != null) {
            return (NestedScrollView) bxbVar.f31814c;
        }
        return null;
    }

    @Override // p204p.u9m0
    public final void start() {
        MobiusLoop.Controller controller = this.f36856Y;
        if (controller == null) {
            wj50.m88260d0("controller");
            throw null;
        }
        controller.mo15604c(this);
        MobiusLoop.Controller controller2 = this.f36856Y;
        if (controller2 != null) {
            controller2.start();
        } else {
            wj50.m88260d0("controller");
            throw null;
        }
    }

    @Override // p204p.u9m0
    public final void stop() {
        MobiusLoop.Controller controller = this.f36856Y;
        if (controller == null) {
            wj50.m88260d0("controller");
            throw null;
        }
        controller.stop();
        MobiusLoop.Controller controller2 = this.f36856Y;
        if (controller2 != null) {
            controller2.disconnect();
        } else {
            wj50.m88260d0("controller");
            throw null;
        }
    }
}
