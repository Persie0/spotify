package p204p;

import android.content.Context;
import android.content.IntentFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.creativework.p054v1.Release;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class rrp implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f202092a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f202093b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f202094c;

    public /* synthetic */ rrp(int i, Object obj, Object obj2) {
        this.f202092a = i;
        this.f202093b = obj;
        this.f202094c = obj2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        gb80 lifecycle;
        gb80 lifecycle2;
        int i = this.f202092a;
        dau dauVar = dau.f47107a;
        int i2 = 5;
        final int i3 = 3;
        final int i4 = 2;
        final int i5 = 1;
        final int i6 = 0;
        Object obj = this.f202094c;
        Object obj2 = this.f202093b;
        switch (i) {
            case 0:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                ((gh00) obj).invoke(n3f0.f150048a);
                return;
            case 1:
            case 2:
                return;
            case 3:
                kn80 kn80Var = (kn80) ((j2r) obj2).f108129c;
                String uri = ((Release) ((ycm0) obj).f271527b).getUri();
                final mn80 mn80Var = (mn80) kn80Var;
                mn80Var.getClass();
                AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
                mn80Var.f145348n = new oa81((kv91) mn80Var.f145343i.f106000a.f182075b.f212413s4.get(), new ahg0(xgg1.m90727W3().f36164a, uri, 5), uri, 13);
                CompositeDisposable compositeDisposable = mn80Var.f145347m;
                q0w q0wVar = mn80Var.f145335a;
                Set set = dd41.f47702f;
                Observable observableM71866a = q0wVar.m71866a(r46.m74726U(uri), Collections.singletonList(m0w.LINKED_ENTITIES));
                Scheduler scheduler = mn80Var.f145336b;
                compositeDisposable.m23395f(observableM71866a.subscribeOn(scheduler).observeOn(mn80Var.f145337c).subscribe(new Consumer() { // from class: p.ln80
                    @Override // io.reactivex.rxjava3.functions.Consumer
                    public final void accept(Object obj3) {
                        String string;
                        switch (i6) {
                            case 0:
                                mn80 mn80Var2 = mn80Var;
                                mn80Var2.getClass();
                                ArrayList arrayList = ((x0w) obj3).f257003a;
                                if (!arrayList.isEmpty()) {
                                    oa81 oa81Var = mn80Var2.f145348n;
                                    if (oa81Var == null) {
                                        wj50.m88260d0("logger");
                                        throw null;
                                    }
                                    kv91 kv91Var = (kv91) oa81Var.f163265b;
                                    ahg0 ahg0Var = (ahg0) oa81Var.f163266c;
                                    String str = (String) oa81Var.f163267d;
                                    yt91 yt91VarM96903c = ahg0Var.f15692b.m96903c();
                                    yt91VarM96903c.f276055i.add(new bu91("episode_associations", null, null, str, null));
                                    yt91VarM96903c.f276056j = true;
                                    zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                                    nu91 nu91Var = new nu91();
                                    nu91Var.f248107a = zt91VarM94607a;
                                    nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                                    kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
                                }
                                nn80 nn80Var = mn80Var2.f145338d;
                                nn80Var.getClass();
                                if (arrayList.isEmpty()) {
                                    x610 x610Var = nn80Var.f156355b;
                                    if (x610Var != null) {
                                        ((ConstraintLayout) x610Var.f258557b).setVisibility(8);
                                        return;
                                    } else {
                                        wj50.m88260d0("binding");
                                        throw null;
                                    }
                                }
                                x610 x610Var2 = nn80Var.f156355b;
                                if (x610Var2 == null) {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                                ((ConstraintLayout) x610Var2.f258557b).setVisibility(0);
                                x610 x610Var3 = nn80Var.f156355b;
                                if (x610Var3 == null) {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                                TextView textView = (TextView) x610Var3.f258558c;
                                Context context = nn80Var.f156354a;
                                if (arrayList.size() > 1) {
                                    string = context.getString(R.string.tagged_section_header_title);
                                } else {
                                    dvg1 dvg1Var = ((wbv) g6f.m43741q0(arrayList)).f249859e;
                                    if (dvg1Var instanceof mxv) {
                                        string = context.getString(R.string.tagged_section_header_title_artist);
                                    } else if (dvg1Var instanceof kxv) {
                                        string = context.getString(R.string.tagged_section_header_title_album);
                                    } else if (dvg1Var instanceof rxv) {
                                        string = context.getString(R.string.tagged_section_header_title_episode);
                                    } else if (dvg1Var instanceof sxv) {
                                        string = context.getString(R.string.tagged_section_header_title_playlist);
                                    } else if (dvg1Var instanceof txv) {
                                        string = context.getString(R.string.tagged_section_header_title_show);
                                    } else if (dvg1Var instanceof uxv) {
                                        string = context.getString(R.string.tagged_section_header_title_track);
                                    } else if (dvg1Var instanceof vxv) {
                                        string = context.getString(R.string.tagged_section_header_title_user);
                                    } else {
                                        if (!(dvg1Var instanceof oxv) && !(dvg1Var instanceof pxv)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        string = context.getString(R.string.tagged_section_header_title_audiobook);
                                    }
                                }
                                wj50.m88279p(string);
                                textView.setText(string);
                                nn80Var.f156356c.mo45325C(arrayList);
                                x610 x610Var4 = nn80Var.f156355b;
                                if (x610Var4 != null) {
                                    ((RecyclerView) x610Var4.f258559d).requestLayout();
                                    return;
                                } else {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                            case 1:
                                mn80 mn80Var3 = mn80Var;
                                mn80Var3.getClass();
                                ((Throwable) obj3).getLocalizedMessage();
                                x610 x610Var5 = mn80Var3.f145338d.f156355b;
                                if (x610Var5 != null) {
                                    ((ConstraintLayout) x610Var5.f258557b).setVisibility(8);
                                    return;
                                } else {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                            case 2:
                                mn80Var.f145350p = ((Boolean) obj3).booleanValue();
                                return;
                            default:
                                mn80Var.f145351q = ((Boolean) obj3).booleanValue();
                                return;
                        }
                    }
                }, new Consumer() { // from class: p.ln80
                    @Override // io.reactivex.rxjava3.functions.Consumer
                    public final void accept(Object obj3) {
                        String string;
                        switch (i5) {
                            case 0:
                                mn80 mn80Var2 = mn80Var;
                                mn80Var2.getClass();
                                ArrayList arrayList = ((x0w) obj3).f257003a;
                                if (!arrayList.isEmpty()) {
                                    oa81 oa81Var = mn80Var2.f145348n;
                                    if (oa81Var == null) {
                                        wj50.m88260d0("logger");
                                        throw null;
                                    }
                                    kv91 kv91Var = (kv91) oa81Var.f163265b;
                                    ahg0 ahg0Var = (ahg0) oa81Var.f163266c;
                                    String str = (String) oa81Var.f163267d;
                                    yt91 yt91VarM96903c = ahg0Var.f15692b.m96903c();
                                    yt91VarM96903c.f276055i.add(new bu91("episode_associations", null, null, str, null));
                                    yt91VarM96903c.f276056j = true;
                                    zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                                    nu91 nu91Var = new nu91();
                                    nu91Var.f248107a = zt91VarM94607a;
                                    nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                                    kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
                                }
                                nn80 nn80Var = mn80Var2.f145338d;
                                nn80Var.getClass();
                                if (arrayList.isEmpty()) {
                                    x610 x610Var = nn80Var.f156355b;
                                    if (x610Var != null) {
                                        ((ConstraintLayout) x610Var.f258557b).setVisibility(8);
                                        return;
                                    } else {
                                        wj50.m88260d0("binding");
                                        throw null;
                                    }
                                }
                                x610 x610Var2 = nn80Var.f156355b;
                                if (x610Var2 == null) {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                                ((ConstraintLayout) x610Var2.f258557b).setVisibility(0);
                                x610 x610Var3 = nn80Var.f156355b;
                                if (x610Var3 == null) {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                                TextView textView = (TextView) x610Var3.f258558c;
                                Context context = nn80Var.f156354a;
                                if (arrayList.size() > 1) {
                                    string = context.getString(R.string.tagged_section_header_title);
                                } else {
                                    dvg1 dvg1Var = ((wbv) g6f.m43741q0(arrayList)).f249859e;
                                    if (dvg1Var instanceof mxv) {
                                        string = context.getString(R.string.tagged_section_header_title_artist);
                                    } else if (dvg1Var instanceof kxv) {
                                        string = context.getString(R.string.tagged_section_header_title_album);
                                    } else if (dvg1Var instanceof rxv) {
                                        string = context.getString(R.string.tagged_section_header_title_episode);
                                    } else if (dvg1Var instanceof sxv) {
                                        string = context.getString(R.string.tagged_section_header_title_playlist);
                                    } else if (dvg1Var instanceof txv) {
                                        string = context.getString(R.string.tagged_section_header_title_show);
                                    } else if (dvg1Var instanceof uxv) {
                                        string = context.getString(R.string.tagged_section_header_title_track);
                                    } else if (dvg1Var instanceof vxv) {
                                        string = context.getString(R.string.tagged_section_header_title_user);
                                    } else {
                                        if (!(dvg1Var instanceof oxv) && !(dvg1Var instanceof pxv)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        string = context.getString(R.string.tagged_section_header_title_audiobook);
                                    }
                                }
                                wj50.m88279p(string);
                                textView.setText(string);
                                nn80Var.f156356c.mo45325C(arrayList);
                                x610 x610Var4 = nn80Var.f156355b;
                                if (x610Var4 != null) {
                                    ((RecyclerView) x610Var4.f258559d).requestLayout();
                                    return;
                                } else {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                            case 1:
                                mn80 mn80Var3 = mn80Var;
                                mn80Var3.getClass();
                                ((Throwable) obj3).getLocalizedMessage();
                                x610 x610Var5 = mn80Var3.f145338d.f156355b;
                                if (x610Var5 != null) {
                                    ((ConstraintLayout) x610Var5.f258557b).setVisibility(8);
                                    return;
                                } else {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                            case 2:
                                mn80Var.f145350p = ((Boolean) obj3).booleanValue();
                                return;
                            default:
                                mn80Var.f145351q = ((Boolean) obj3).booleanValue();
                                return;
                        }
                    }
                }), mn80Var.f145344j.m64106a().distinctUntilChanged().observeOn(scheduler).subscribe(new Consumer() { // from class: p.ln80
                    @Override // io.reactivex.rxjava3.functions.Consumer
                    public final void accept(Object obj3) {
                        String string;
                        switch (i4) {
                            case 0:
                                mn80 mn80Var2 = mn80Var;
                                mn80Var2.getClass();
                                ArrayList arrayList = ((x0w) obj3).f257003a;
                                if (!arrayList.isEmpty()) {
                                    oa81 oa81Var = mn80Var2.f145348n;
                                    if (oa81Var == null) {
                                        wj50.m88260d0("logger");
                                        throw null;
                                    }
                                    kv91 kv91Var = (kv91) oa81Var.f163265b;
                                    ahg0 ahg0Var = (ahg0) oa81Var.f163266c;
                                    String str = (String) oa81Var.f163267d;
                                    yt91 yt91VarM96903c = ahg0Var.f15692b.m96903c();
                                    yt91VarM96903c.f276055i.add(new bu91("episode_associations", null, null, str, null));
                                    yt91VarM96903c.f276056j = true;
                                    zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                                    nu91 nu91Var = new nu91();
                                    nu91Var.f248107a = zt91VarM94607a;
                                    nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                                    kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
                                }
                                nn80 nn80Var = mn80Var2.f145338d;
                                nn80Var.getClass();
                                if (arrayList.isEmpty()) {
                                    x610 x610Var = nn80Var.f156355b;
                                    if (x610Var != null) {
                                        ((ConstraintLayout) x610Var.f258557b).setVisibility(8);
                                        return;
                                    } else {
                                        wj50.m88260d0("binding");
                                        throw null;
                                    }
                                }
                                x610 x610Var2 = nn80Var.f156355b;
                                if (x610Var2 == null) {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                                ((ConstraintLayout) x610Var2.f258557b).setVisibility(0);
                                x610 x610Var3 = nn80Var.f156355b;
                                if (x610Var3 == null) {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                                TextView textView = (TextView) x610Var3.f258558c;
                                Context context = nn80Var.f156354a;
                                if (arrayList.size() > 1) {
                                    string = context.getString(R.string.tagged_section_header_title);
                                } else {
                                    dvg1 dvg1Var = ((wbv) g6f.m43741q0(arrayList)).f249859e;
                                    if (dvg1Var instanceof mxv) {
                                        string = context.getString(R.string.tagged_section_header_title_artist);
                                    } else if (dvg1Var instanceof kxv) {
                                        string = context.getString(R.string.tagged_section_header_title_album);
                                    } else if (dvg1Var instanceof rxv) {
                                        string = context.getString(R.string.tagged_section_header_title_episode);
                                    } else if (dvg1Var instanceof sxv) {
                                        string = context.getString(R.string.tagged_section_header_title_playlist);
                                    } else if (dvg1Var instanceof txv) {
                                        string = context.getString(R.string.tagged_section_header_title_show);
                                    } else if (dvg1Var instanceof uxv) {
                                        string = context.getString(R.string.tagged_section_header_title_track);
                                    } else if (dvg1Var instanceof vxv) {
                                        string = context.getString(R.string.tagged_section_header_title_user);
                                    } else {
                                        if (!(dvg1Var instanceof oxv) && !(dvg1Var instanceof pxv)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        string = context.getString(R.string.tagged_section_header_title_audiobook);
                                    }
                                }
                                wj50.m88279p(string);
                                textView.setText(string);
                                nn80Var.f156356c.mo45325C(arrayList);
                                x610 x610Var4 = nn80Var.f156355b;
                                if (x610Var4 != null) {
                                    ((RecyclerView) x610Var4.f258559d).requestLayout();
                                    return;
                                } else {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                            case 1:
                                mn80 mn80Var3 = mn80Var;
                                mn80Var3.getClass();
                                ((Throwable) obj3).getLocalizedMessage();
                                x610 x610Var5 = mn80Var3.f145338d.f156355b;
                                if (x610Var5 != null) {
                                    ((ConstraintLayout) x610Var5.f258557b).setVisibility(8);
                                    return;
                                } else {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                            case 2:
                                mn80Var.f145350p = ((Boolean) obj3).booleanValue();
                                return;
                            default:
                                mn80Var.f145351q = ((Boolean) obj3).booleanValue();
                                return;
                        }
                    }
                }), k0e1.m54988g(mn80Var.f145345k.f81493a, dauVar).distinctUntilChanged().observeOn(scheduler).subscribe(new Consumer() { // from class: p.ln80
                    @Override // io.reactivex.rxjava3.functions.Consumer
                    public final void accept(Object obj3) {
                        String string;
                        switch (i3) {
                            case 0:
                                mn80 mn80Var2 = mn80Var;
                                mn80Var2.getClass();
                                ArrayList arrayList = ((x0w) obj3).f257003a;
                                if (!arrayList.isEmpty()) {
                                    oa81 oa81Var = mn80Var2.f145348n;
                                    if (oa81Var == null) {
                                        wj50.m88260d0("logger");
                                        throw null;
                                    }
                                    kv91 kv91Var = (kv91) oa81Var.f163265b;
                                    ahg0 ahg0Var = (ahg0) oa81Var.f163266c;
                                    String str = (String) oa81Var.f163267d;
                                    yt91 yt91VarM96903c = ahg0Var.f15692b.m96903c();
                                    yt91VarM96903c.f276055i.add(new bu91("episode_associations", null, null, str, null));
                                    yt91VarM96903c.f276056j = true;
                                    zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                                    nu91 nu91Var = new nu91();
                                    nu91Var.f248107a = zt91VarM94607a;
                                    nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                                    kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
                                }
                                nn80 nn80Var = mn80Var2.f145338d;
                                nn80Var.getClass();
                                if (arrayList.isEmpty()) {
                                    x610 x610Var = nn80Var.f156355b;
                                    if (x610Var != null) {
                                        ((ConstraintLayout) x610Var.f258557b).setVisibility(8);
                                        return;
                                    } else {
                                        wj50.m88260d0("binding");
                                        throw null;
                                    }
                                }
                                x610 x610Var2 = nn80Var.f156355b;
                                if (x610Var2 == null) {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                                ((ConstraintLayout) x610Var2.f258557b).setVisibility(0);
                                x610 x610Var3 = nn80Var.f156355b;
                                if (x610Var3 == null) {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                                TextView textView = (TextView) x610Var3.f258558c;
                                Context context = nn80Var.f156354a;
                                if (arrayList.size() > 1) {
                                    string = context.getString(R.string.tagged_section_header_title);
                                } else {
                                    dvg1 dvg1Var = ((wbv) g6f.m43741q0(arrayList)).f249859e;
                                    if (dvg1Var instanceof mxv) {
                                        string = context.getString(R.string.tagged_section_header_title_artist);
                                    } else if (dvg1Var instanceof kxv) {
                                        string = context.getString(R.string.tagged_section_header_title_album);
                                    } else if (dvg1Var instanceof rxv) {
                                        string = context.getString(R.string.tagged_section_header_title_episode);
                                    } else if (dvg1Var instanceof sxv) {
                                        string = context.getString(R.string.tagged_section_header_title_playlist);
                                    } else if (dvg1Var instanceof txv) {
                                        string = context.getString(R.string.tagged_section_header_title_show);
                                    } else if (dvg1Var instanceof uxv) {
                                        string = context.getString(R.string.tagged_section_header_title_track);
                                    } else if (dvg1Var instanceof vxv) {
                                        string = context.getString(R.string.tagged_section_header_title_user);
                                    } else {
                                        if (!(dvg1Var instanceof oxv) && !(dvg1Var instanceof pxv)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        string = context.getString(R.string.tagged_section_header_title_audiobook);
                                    }
                                }
                                wj50.m88279p(string);
                                textView.setText(string);
                                nn80Var.f156356c.mo45325C(arrayList);
                                x610 x610Var4 = nn80Var.f156355b;
                                if (x610Var4 != null) {
                                    ((RecyclerView) x610Var4.f258559d).requestLayout();
                                    return;
                                } else {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                            case 1:
                                mn80 mn80Var3 = mn80Var;
                                mn80Var3.getClass();
                                ((Throwable) obj3).getLocalizedMessage();
                                x610 x610Var5 = mn80Var3.f145338d.f156355b;
                                if (x610Var5 != null) {
                                    ((ConstraintLayout) x610Var5.f258557b).setVisibility(8);
                                    return;
                                } else {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                            case 2:
                                mn80Var.f145350p = ((Boolean) obj3).booleanValue();
                                return;
                            default:
                                mn80Var.f145351q = ((Boolean) obj3).booleanValue();
                                return;
                        }
                    }
                }));
                return;
            case 4:
                kxv0 kxv0Var = (kxv0) ((nps) obj2).f157064c;
                ycm0 ycm0Var = (ycm0) obj;
                String uri2 = ((Release) ycm0Var.f271527b).getUri();
                st91 st91Var = (st91) ycm0Var.f271531f;
                final mxv0 mxv0Var = (mxv0) kxv0Var;
                mxv0Var.getClass();
                AtomicReferenceArray atomicReferenceArray2 = cbm0.f36163e;
                mxv0Var.f148204n = new uj81(9, (kv91) mxv0Var.f148199i.f95429a.f182075b.f212413s4.get(), new hog0(0, xgg1.m90727W3().f36164a, uri2, st91Var));
                CompositeDisposable compositeDisposable2 = mxv0Var.f148203m;
                q0w q0wVar2 = mxv0Var.f148191a;
                Set set2 = dd41.f47702f;
                Observable observableM71866a2 = q0wVar2.m71866a(r46.m74726U(uri2), Collections.singletonList(m0w.RELATED_CONTENT));
                Scheduler scheduler2 = mxv0Var.f148192b;
                compositeDisposable2.m23395f(observableM71866a2.subscribeOn(scheduler2).observeOn(mxv0Var.f148193c).subscribe(new Consumer() { // from class: p.lxv0
                    @Override // io.reactivex.rxjava3.functions.Consumer
                    public final void accept(Object obj3) {
                        switch (i6) {
                            case 0:
                                mxv0 mxv0Var2 = mxv0Var;
                                mxv0Var2.getClass();
                                ArrayList arrayList = ((x0w) obj3).f257004b;
                                if (!arrayList.isEmpty()) {
                                    uj81 uj81Var = mxv0Var2.f148204n;
                                    if (uj81Var == null) {
                                        wj50.m88260d0("logger");
                                        throw null;
                                    }
                                    kv91 kv91Var = (kv91) uj81Var.f230940b;
                                    hog0 hog0Var = (hog0) uj81Var.f230941c;
                                    yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
                                    yt91VarM96903c.f276055i.add(new bu91("related_content", null, null, null, null));
                                    yt91VarM96903c.f276056j = true;
                                    zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                                    nu91 nu91Var = new nu91();
                                    nu91Var.f248107a = zt91VarM94607a;
                                    nu91Var.f248108b = hog0Var.f93537b;
                                    nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                                    kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
                                }
                                fyv0 fyv0Var = mxv0Var2.f148194d;
                                fyv0Var.getClass();
                                if (arrayList.isEmpty()) {
                                    a470 a470Var = fyv0Var.f74859a;
                                    if (a470Var != null) {
                                        ((ConstraintLayout) a470Var.f12149b).setVisibility(8);
                                        return;
                                    } else {
                                        wj50.m88260d0("binding");
                                        throw null;
                                    }
                                }
                                a470 a470Var2 = fyv0Var.f74859a;
                                if (a470Var2 == null) {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                                ((ConstraintLayout) a470Var2.f12149b).setVisibility(0);
                                fyv0Var.f74860b.mo45325C(arrayList);
                                a470 a470Var3 = fyv0Var.f74859a;
                                if (a470Var3 != null) {
                                    ((RecyclerView) a470Var3.f12150c).requestLayout();
                                    return;
                                } else {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                            case 1:
                                mxv0 mxv0Var3 = mxv0Var;
                                mxv0Var3.getClass();
                                ((Throwable) obj3).getLocalizedMessage();
                                a470 a470Var4 = mxv0Var3.f148194d.f74859a;
                                if (a470Var4 != null) {
                                    ((ConstraintLayout) a470Var4.f12149b).setVisibility(8);
                                    return;
                                } else {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                            case 2:
                                mxv0Var.f148206p = ((Boolean) obj3).booleanValue();
                                return;
                            default:
                                mxv0Var.f148207q = ((Boolean) obj3).booleanValue();
                                return;
                        }
                    }
                }, new Consumer() { // from class: p.lxv0
                    @Override // io.reactivex.rxjava3.functions.Consumer
                    public final void accept(Object obj3) {
                        switch (i5) {
                            case 0:
                                mxv0 mxv0Var2 = mxv0Var;
                                mxv0Var2.getClass();
                                ArrayList arrayList = ((x0w) obj3).f257004b;
                                if (!arrayList.isEmpty()) {
                                    uj81 uj81Var = mxv0Var2.f148204n;
                                    if (uj81Var == null) {
                                        wj50.m88260d0("logger");
                                        throw null;
                                    }
                                    kv91 kv91Var = (kv91) uj81Var.f230940b;
                                    hog0 hog0Var = (hog0) uj81Var.f230941c;
                                    yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
                                    yt91VarM96903c.f276055i.add(new bu91("related_content", null, null, null, null));
                                    yt91VarM96903c.f276056j = true;
                                    zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                                    nu91 nu91Var = new nu91();
                                    nu91Var.f248107a = zt91VarM94607a;
                                    nu91Var.f248108b = hog0Var.f93537b;
                                    nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                                    kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
                                }
                                fyv0 fyv0Var = mxv0Var2.f148194d;
                                fyv0Var.getClass();
                                if (arrayList.isEmpty()) {
                                    a470 a470Var = fyv0Var.f74859a;
                                    if (a470Var != null) {
                                        ((ConstraintLayout) a470Var.f12149b).setVisibility(8);
                                        return;
                                    } else {
                                        wj50.m88260d0("binding");
                                        throw null;
                                    }
                                }
                                a470 a470Var2 = fyv0Var.f74859a;
                                if (a470Var2 == null) {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                                ((ConstraintLayout) a470Var2.f12149b).setVisibility(0);
                                fyv0Var.f74860b.mo45325C(arrayList);
                                a470 a470Var3 = fyv0Var.f74859a;
                                if (a470Var3 != null) {
                                    ((RecyclerView) a470Var3.f12150c).requestLayout();
                                    return;
                                } else {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                            case 1:
                                mxv0 mxv0Var3 = mxv0Var;
                                mxv0Var3.getClass();
                                ((Throwable) obj3).getLocalizedMessage();
                                a470 a470Var4 = mxv0Var3.f148194d.f74859a;
                                if (a470Var4 != null) {
                                    ((ConstraintLayout) a470Var4.f12149b).setVisibility(8);
                                    return;
                                } else {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                            case 2:
                                mxv0Var.f148206p = ((Boolean) obj3).booleanValue();
                                return;
                            default:
                                mxv0Var.f148207q = ((Boolean) obj3).booleanValue();
                                return;
                        }
                    }
                }), mxv0Var.f148200j.m64106a().distinctUntilChanged().observeOn(scheduler2).subscribe(new Consumer() { // from class: p.lxv0
                    @Override // io.reactivex.rxjava3.functions.Consumer
                    public final void accept(Object obj3) {
                        switch (i4) {
                            case 0:
                                mxv0 mxv0Var2 = mxv0Var;
                                mxv0Var2.getClass();
                                ArrayList arrayList = ((x0w) obj3).f257004b;
                                if (!arrayList.isEmpty()) {
                                    uj81 uj81Var = mxv0Var2.f148204n;
                                    if (uj81Var == null) {
                                        wj50.m88260d0("logger");
                                        throw null;
                                    }
                                    kv91 kv91Var = (kv91) uj81Var.f230940b;
                                    hog0 hog0Var = (hog0) uj81Var.f230941c;
                                    yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
                                    yt91VarM96903c.f276055i.add(new bu91("related_content", null, null, null, null));
                                    yt91VarM96903c.f276056j = true;
                                    zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                                    nu91 nu91Var = new nu91();
                                    nu91Var.f248107a = zt91VarM94607a;
                                    nu91Var.f248108b = hog0Var.f93537b;
                                    nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                                    kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
                                }
                                fyv0 fyv0Var = mxv0Var2.f148194d;
                                fyv0Var.getClass();
                                if (arrayList.isEmpty()) {
                                    a470 a470Var = fyv0Var.f74859a;
                                    if (a470Var != null) {
                                        ((ConstraintLayout) a470Var.f12149b).setVisibility(8);
                                        return;
                                    } else {
                                        wj50.m88260d0("binding");
                                        throw null;
                                    }
                                }
                                a470 a470Var2 = fyv0Var.f74859a;
                                if (a470Var2 == null) {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                                ((ConstraintLayout) a470Var2.f12149b).setVisibility(0);
                                fyv0Var.f74860b.mo45325C(arrayList);
                                a470 a470Var3 = fyv0Var.f74859a;
                                if (a470Var3 != null) {
                                    ((RecyclerView) a470Var3.f12150c).requestLayout();
                                    return;
                                } else {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                            case 1:
                                mxv0 mxv0Var3 = mxv0Var;
                                mxv0Var3.getClass();
                                ((Throwable) obj3).getLocalizedMessage();
                                a470 a470Var4 = mxv0Var3.f148194d.f74859a;
                                if (a470Var4 != null) {
                                    ((ConstraintLayout) a470Var4.f12149b).setVisibility(8);
                                    return;
                                } else {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                            case 2:
                                mxv0Var.f148206p = ((Boolean) obj3).booleanValue();
                                return;
                            default:
                                mxv0Var.f148207q = ((Boolean) obj3).booleanValue();
                                return;
                        }
                    }
                }), k0e1.m54988g(mxv0Var.f148201k.f81493a, dauVar).distinctUntilChanged().observeOn(scheduler2).subscribe(new Consumer() { // from class: p.lxv0
                    @Override // io.reactivex.rxjava3.functions.Consumer
                    public final void accept(Object obj3) {
                        switch (i3) {
                            case 0:
                                mxv0 mxv0Var2 = mxv0Var;
                                mxv0Var2.getClass();
                                ArrayList arrayList = ((x0w) obj3).f257004b;
                                if (!arrayList.isEmpty()) {
                                    uj81 uj81Var = mxv0Var2.f148204n;
                                    if (uj81Var == null) {
                                        wj50.m88260d0("logger");
                                        throw null;
                                    }
                                    kv91 kv91Var = (kv91) uj81Var.f230940b;
                                    hog0 hog0Var = (hog0) uj81Var.f230941c;
                                    yt91 yt91VarM96903c = hog0Var.f93538c.m96903c();
                                    yt91VarM96903c.f276055i.add(new bu91("related_content", null, null, null, null));
                                    yt91VarM96903c.f276056j = true;
                                    zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                                    nu91 nu91Var = new nu91();
                                    nu91Var.f248107a = zt91VarM94607a;
                                    nu91Var.f248108b = hog0Var.f93537b;
                                    nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                                    kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
                                }
                                fyv0 fyv0Var = mxv0Var2.f148194d;
                                fyv0Var.getClass();
                                if (arrayList.isEmpty()) {
                                    a470 a470Var = fyv0Var.f74859a;
                                    if (a470Var != null) {
                                        ((ConstraintLayout) a470Var.f12149b).setVisibility(8);
                                        return;
                                    } else {
                                        wj50.m88260d0("binding");
                                        throw null;
                                    }
                                }
                                a470 a470Var2 = fyv0Var.f74859a;
                                if (a470Var2 == null) {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                                ((ConstraintLayout) a470Var2.f12149b).setVisibility(0);
                                fyv0Var.f74860b.mo45325C(arrayList);
                                a470 a470Var3 = fyv0Var.f74859a;
                                if (a470Var3 != null) {
                                    ((RecyclerView) a470Var3.f12150c).requestLayout();
                                    return;
                                } else {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                            case 1:
                                mxv0 mxv0Var3 = mxv0Var;
                                mxv0Var3.getClass();
                                ((Throwable) obj3).getLocalizedMessage();
                                a470 a470Var4 = mxv0Var3.f148194d.f74859a;
                                if (a470Var4 != null) {
                                    ((ConstraintLayout) a470Var4.f12149b).setVisibility(8);
                                    return;
                                } else {
                                    wj50.m88260d0("binding");
                                    throw null;
                                }
                            case 2:
                                mxv0Var.f148206p = ((Boolean) obj3).booleanValue();
                                return;
                            default:
                                mxv0Var.f148207q = ((Boolean) obj3).booleanValue();
                                return;
                        }
                    }
                }));
                return;
            case 5:
                aba0.m25342a((Context) obj2).m25343b((mez) obj, new IntentFilter("on-demand-restricted"));
                return;
            case 6:
                aba0.m25342a((Context) obj2).m25343b((mez) obj, new IntentFilter("on-demand-restricted"));
                return;
            case 7:
                j5o0 j5o0Var = (j5o0) obj2;
                j5o0Var.f109030g = true;
                hc80 hc80VarM40067h = eug1.m40067h(view);
                if (hc80VarM40067h != null && (lifecycle = hc80VarM40067h.getLifecycle()) != null) {
                    lifecycle.mo31986a(j5o0Var);
                }
                view.getViewTreeObserver().addOnScrollChangedListener((i5o0) obj);
                return;
            case 8:
                View view2 = (View) obj2;
                if (view2.getViewTreeObserver().isAlive()) {
                    view2.getViewTreeObserver().addOnDrawListener((okv0) obj);
                }
                view2.removeOnAttachStateChangeListener(this);
                return;
            case 9:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                ((ConstraintLayout) obj).requestApplyInsets();
                return;
            case 10:
                ((kt51) obj2).m57309c((ImageView) obj);
                return;
            case 11:
                ((EditText) obj2).removeOnAttachStateChangeListener(this);
                EditText editText = (EditText) obj;
                editText.requestFocus();
                if (!editText.hasWindowFocus()) {
                    editText.getViewTreeObserver().addOnWindowFocusChangeListener(new a2b1(editText, 0));
                    return;
                } else {
                    if (editText.isFocused()) {
                        editText.post(new n081(editText, i2));
                        return;
                    }
                    return;
                }
            case 12:
                ((zob1) obj2).invoke();
                return;
            case 13:
                ((ViewGroup) obj2).removeOnAttachStateChangeListener(this);
                ((ViewGroup) obj).requestApplyInsets();
                return;
            case 14:
                AbstractC2441u6 abstractC2441u6 = (AbstractC2441u6) obj2;
                hc80 hc80VarM40067h2 = eug1.m40067h(abstractC2441u6);
                if (hc80VarM40067h2 != null) {
                    ((rlv0) obj).f200373a = krg1.m57161e(abstractC2441u6, hc80VarM40067h2.getLifecycle());
                    abstractC2441u6.removeOnAttachStateChangeListener(this);
                    return;
                } else {
                    mt40.m62792d("View tree for " + abstractC2441u6 + " has no ViewTreeLifecycleOwner");
                    throw new KotlinNothingValueException();
                }
            case 15:
                hc80 hc80VarM40067h3 = eug1.m40067h(view);
                if (hc80VarM40067h3 != null) {
                    rlv0 rlv0Var = (rlv0) obj2;
                    gcq gcqVar = (gcq) obj;
                    if (hc80VarM40067h3.equals(rlv0Var.f200373a)) {
                        return;
                    }
                    hc80 hc80Var = (hc80) rlv0Var.f200373a;
                    if (hc80Var != null && (lifecycle2 = hc80Var.getLifecycle()) != null) {
                        lifecycle2.mo31988d(gcqVar);
                    }
                    rlv0Var.f200373a = hc80VarM40067h3;
                    hc80VarM40067h3.getLifecycle().mo31986a(gcqVar);
                    return;
                }
                return;
            case 16:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = mec1.f142677a;
                aec1.m25717c((View) obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [p.gh00, p.qe70] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f202092a) {
            case 0:
                break;
            case 1:
                ((View) this.f202093b).removeOnAttachStateChangeListener(this);
                ((hcq) this.f202094c).f89884a.m95875f();
                break;
            case 2:
                ((View) this.f202093b).removeOnAttachStateChangeListener(this);
                di41 di41Var = ((ntr) this.f202094c).f158125b;
                if (di41Var != null) {
                    di41Var.mo26601e(null);
                }
                break;
            case 3:
                mn80 mn80Var = (mn80) ((kn80) ((j2r) this.f202093b).f108129c);
                mn80Var.f145347m.m23396g();
                mn80Var.f145349o.clear();
                break;
            case 4:
                mxv0 mxv0Var = (mxv0) ((kxv0) ((nps) this.f202093b).f157064c);
                mxv0Var.f148203m.m23396g();
                mxv0Var.f148205o.clear();
                break;
            case 5:
                aba0.m25342a((Context) this.f202093b).m25345d((mez) this.f202094c);
                break;
            case 6:
                aba0.m25342a((Context) this.f202093b).m25345d((mez) this.f202094c);
                break;
            case 7:
                j5o0 j5o0Var = (j5o0) this.f202093b;
                j5o0Var.f109030g = false;
                Object objInvoke = j5o0Var.f109025b.invoke(Boolean.FALSE);
                if (objInvoke != null) {
                    j5o0Var.f109026c.invoke(objInvoke);
                }
                view.getViewTreeObserver().removeOnScrollChangedListener((i5o0) this.f202094c);
                break;
            case 8:
            case 9:
                break;
            case 10:
                ImageView imageView = (ImageView) this.f202094c;
                sdc1 sdc1Var = ((kt51) this.f202093b).f126149i;
                if (sdc1Var != null && sdc1Var.f207982e.get() == imageView) {
                    sdc1Var.m77829b();
                }
                imageView.setImageDrawable(null);
                break;
            case 11:
                break;
            case 12:
                ((zob1) this.f202094c).invoke();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                break;
            default:
                ((View) this.f202093b).removeOnAttachStateChangeListener(this);
                ((wgv0) this.f202094c).m88063B();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m76294a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m76295b(View view) {
    }

    /* JADX INFO: renamed from: c */
    private final void m76296c(View view) {
    }

    /* JADX INFO: renamed from: d */
    private final void m76297d(View view) {
    }

    /* JADX INFO: renamed from: e */
    private final void m76298e(View view) {
    }

    /* JADX INFO: renamed from: f */
    private final void m76299f(View view) {
    }

    /* JADX INFO: renamed from: g */
    private final void m76300g(View view) {
    }

    /* JADX INFO: renamed from: h */
    private final void m76301h(View view) {
    }

    /* JADX INFO: renamed from: i */
    private final void m76302i(View view) {
    }

    /* JADX INFO: renamed from: j */
    private final void m76303j(View view) {
    }

    /* JADX INFO: renamed from: k */
    private final void m76304k(View view) {
    }
}
