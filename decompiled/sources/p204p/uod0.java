package p204p;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.legacyglue.carousel.CarouselLayoutManager;
import com.spotify.marquee.marquee.MarqueeActivity;
import com.spotify.music.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class uod0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f232404a;

    /* JADX INFO: renamed from: b */
    public Object f232405b;

    /* JADX INFO: renamed from: c */
    public final Object f232406c;

    public /* synthetic */ uod0(int i, Object obj, Object obj2) {
        this.f232404a = i;
        this.f232405b = obj;
        this.f232406c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f232405b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        p204p.ftz0.f73353f.m34241a().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f232405b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        r10.f232405b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m83615a() {
        Runnable runnable;
        boolean z = false;
        boolean zInterrupted = false;
        while (true) {
            try {
                synchronized (((ftz0) this.f232406c).f73355b) {
                    if (z) {
                        runnable = (Runnable) ((ftz0) this.f232406c).f73355b.poll();
                        this.f232405b = runnable;
                        if (runnable == null) {
                            ((ftz0) this.f232406c).f73356c = 1;
                        }
                    } else {
                        ftz0 ftz0Var = (ftz0) this.f232406c;
                        if (ftz0Var.f73356c != 4) {
                            ftz0Var.f73357d++;
                            ftz0Var.f73356c = 4;
                            z = true;
                            runnable = (Runnable) ((ftz0) this.f232406c).f73355b.poll();
                            this.f232405b = runnable;
                            if (runnable == null) {
                                ((ftz0) this.f232406c).f73356c = 1;
                            }
                        }
                    }
                }
                if (zInterrupted) {
                    break;
                } else {
                    return;
                }
                this.f232405b = null;
            } catch (Throwable th) {
                if (zInterrupted) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        Thread.currentThread().interrupt();
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        View view;
        int i = 1;
        z = true;
        boolean z = true;
        int i2 = 0;
        Throwable th = null;
        switch (this.f232404a) {
            case 0:
                PlaybackStateCompat playbackStateCompat = (PlaybackStateCompat) this.f232406c;
                xod0 xod0Var = (xod0) this.f232405b;
                ood0 ood0Var = xod0Var.f264255i;
                if (ood0Var == null) {
                    wj50.m88260d0("mediaSessionCompat");
                    throw null;
                }
                jod0 jod0Var = (jod0) ood0Var.f167565b;
                jod0Var.f114399g = playbackStateCompat;
                synchronized (jod0Var.f114396d) {
                    for (int iBeginBroadcast = jod0Var.f114398f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                        try {
                            ((fv30) jod0Var.f114398f.getBroadcastItem(iBeginBroadcast)).mo40087Y1(playbackStateCompat);
                        } catch (RemoteException unused) {
                        }
                    }
                    jod0Var.f114398f.finishBroadcast();
                    break;
                }
                MediaSession mediaSession = jod0Var.f114393a;
                if (playbackStateCompat.f31Y == null) {
                    PlaybackState.Builder builderM24711d = a4p0.m24711d();
                    a4p0.m24731x(builderM24711d, playbackStateCompat.f32a, playbackStateCompat.f33b, playbackStateCompat.f35d, playbackStateCompat.f39h);
                    a4p0.m24728u(builderM24711d, playbackStateCompat.f34c);
                    a4p0.m24726s(builderM24711d, playbackStateCompat.f36e);
                    a4p0.m24729v(builderM24711d, playbackStateCompat.f38g);
                    Iterator it = playbackStateCompat.f40i.iterator();
                    while (it.hasNext()) {
                        a4p0.m24708a(builderM24711d, ((PlaybackStateCompat.CustomAction) it.next()).m36g());
                    }
                    a4p0.m24727t(builderM24711d, playbackStateCompat.f41t);
                    b4p0.m28100b(builderM24711d, playbackStateCompat.f30X);
                    playbackStateCompat.f31Y = a4p0.m24710c(builderM24711d);
                }
                mediaSession.setPlaybackState(playbackStateCompat.f31Y);
                ood0 ood0Var2 = xod0Var.f264255i;
                if (ood0Var2 == null) {
                    wj50.m88260d0("mediaSessionCompat");
                    throw null;
                }
                ood0Var2.m67485C(lau.f131415a);
                ood0 ood0Var3 = xod0Var.f264255i;
                if (ood0Var3 == null) {
                    wj50.m88260d0("mediaSessionCompat");
                    throw null;
                }
                ood0Var3.m67484B(new MediaMetadataCompat(new Bundle()));
                xod0Var.f264254h.onNext(xod0.m91544m(xod0Var, playbackStateCompat));
                return;
            case 1:
                aqp aqpVar = ((xod0) this.f232405b).f264258l;
                if (aqpVar != null) {
                    aqpVar.m26887f(null);
                }
                ((xod0) this.f232405b).f264258l = (aqp) this.f232406c;
                aqp aqpVar2 = (aqp) this.f232406c;
                ood0 ood0Var4 = ((xod0) this.f232405b).f264255i;
                if (ood0Var4 != null) {
                    aqpVar2.m26887f(ood0Var4);
                    return;
                } else {
                    wj50.m88260d0("mediaSessionCompat");
                    throw null;
                }
            case 2:
                ood0 ood0Var5 = ((xod0) this.f232405b).f264255i;
                if (ood0Var5 != null) {
                    ((jod0) ood0Var5.f167565b).f114393a.setPlaybackToRemote(((wod0) this.f232406c).mo68416a());
                    return;
                } else {
                    wj50.m88260d0("mediaSessionCompat");
                    throw null;
                }
            case 3:
                wlt0 wlt0Var = (wlt0) this.f232406c;
                List list = wlt0Var.f252618c;
                xod0 xod0Var2 = (xod0) this.f232405b;
                if (xod0.m91543l(xod0Var2)) {
                    if (list.isEmpty()) {
                        ood0 ood0Var6 = xod0Var2.f264255i;
                        if (ood0Var6 == null) {
                            wj50.m88260d0("mediaSessionCompat");
                            throw null;
                        }
                        ood0Var6.m67485C(lau.f131415a);
                        ood0 ood0Var7 = xod0Var2.f264255i;
                        if (ood0Var7 != null) {
                            ((jod0) ood0Var7.f167565b).f114393a.setQueueTitle("");
                            return;
                        } else {
                            wj50.m88260d0("mediaSessionCompat");
                            throw null;
                        }
                    }
                    ood0 ood0Var8 = xod0Var2.f264255i;
                    if (ood0Var8 == null) {
                        wj50.m88260d0("mediaSessionCompat");
                        throw null;
                    }
                    ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                    int i3 = 0;
                    for (Object obj : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            h6f.m46722S();
                            throw th;
                        }
                        rsd0 rsd0Var = (rsd0) obj;
                        long j = i3;
                        int i5 = i;
                        long j2 = j + wlt0Var.f252617b;
                        Uri uri = rsd0Var.f202298g;
                        boolean z2 = rsd0Var.f202310s;
                        String str = rsd0Var.f202293b;
                        String str2 = rsd0Var.f202294c ? rsd0Var.f202295d : rsd0Var.f202296e;
                        Bundle bundle = new Bundle();
                        bundle.putLong("android.media.IS_EXPLICIT", ((rsd0Var.f202301j || z2) ? i5 : 0) != 0 ? 1L : 0L);
                        bundle.putLong("com.spotify.music.extra.IS_19_PLUS", z2 ? 1L : 0L);
                        th = null;
                        arrayList.add(new MediaSessionCompat$QueueItem(null, new MediaDescriptionCompat(rsd0Var.f202292a, str, str2, null, null, uri, bundle, null), j2));
                        i3 = i4;
                        i = i5;
                    }
                    ood0Var8.m67485C(arrayList);
                    ood0 ood0Var9 = xod0Var2.f264255i;
                    if (ood0Var9 != null) {
                        ((jod0) ood0Var9.f167565b).f114393a.setQueueTitle(wlt0Var.f252616a);
                        return;
                    } else {
                        wj50.m88260d0("mediaSessionCompat");
                        throw th;
                    }
                }
                return;
            case 4:
                Intent intent = (Intent) this.f232406c;
                try {
                    ((ddi0) this.f232405b).f47831a.startActivity(intent, null);
                    return;
                } catch (ActivityNotFoundException e) {
                    StackTraceElement[] stackTrace = e.getStackTrace();
                    int length = stackTrace.length + 2;
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[length];
                    int i6 = 0;
                    while (i6 < length) {
                        stackTraceElementArr[i6] = i6 != 0 ? i6 != 1 ? stackTrace[i6 - 2] : new StackTraceElement("[[ Failed to open uri ↑↑ ]] ", "", "", 0) : new StackTraceElement(intent.getDataString(), "", "", 0);
                        i6++;
                    }
                    e.setStackTrace(stackTraceElementArr);
                    throw e;
                }
            case 5:
                m500 m500Var = (m500) this.f232405b;
                m500Var.f31643a.mo31986a(new sr0(4, (dxk0) this.f232406c, m500Var));
                return;
            case 6:
                ((ConcurrentHashMap) ((b141) ((j4u) this.f232405b).f108784c).f22213c).keySet().removeIf(new n7j0(((kbm0) this.f232406c).f121231a, 3));
                return;
            case 7:
                ((EditText) this.f232405b).removeTextChangedListener(((x9n0) ((she) this.f232406c).f209186b).f259408e);
                return;
            case 8:
                ((Handler) ((y0i0) this.f232406c).f267989b).post((cjs0) this.f232405b);
                return;
            case 9:
                ((gh50) this.f232405b).mo44722v((ih50) this.f232406c);
                return;
            case 10:
                s2o s2oVar = (s2o) this.f232405b;
                eh00 eh00Var = (eh00) this.f232406c;
                ((gb80) s2oVar.f205041h).mo31988d((e16) s2oVar.f205043t);
                eh00Var.invoke();
                return;
            case 11:
                bjq0 bjq0Var = (bjq0) this.f232405b;
                String string = ((Uri) this.f232406c).toString();
                int i7 = bjq0.f27753U1;
                bjq0Var.m75951u1(string);
                return;
            case 12:
                zrt0 zrt0Var = (zrt0) this.f232405b;
                ArrayList arrayList2 = zrt0Var.f285749t;
                List list2 = (List) this.f232406c;
                oir oirVarM45541n = grl0.m45541n(new ylt0(i2, arrayList2, list2));
                zrt0Var.f285749t.clear();
                zrt0Var.f285749t.addAll(list2);
                oirVarM45541n.m67057b(zrt0Var);
                return;
            case 13:
                gvt0.m45901a((gvt0) this.f232405b, ((C2655zm) this.f232406c).mo1617e());
                return;
            case 14:
                c1v0 c1v0Var = (c1v0) this.f232405b;
                c1v0Var.f33199c.set(true);
                ArrayList arrayListM31280a = c1v0.m31280a(c1v0Var);
                String str3 = (String) this.f232406c;
                arrayListM31280a.remove(str3);
                arrayListM31280a.add(0, str3);
                c1v0.m31281b(c1v0Var, arrayListM31280a);
                return;
            case 15:
                ((mav0) this.f232405b).f141697k.onNext(new dav0((String) this.f232406c));
                return;
            case 16:
                View view2 = (View) this.f232405b;
                if (view2.getViewTreeObserver().isAlive()) {
                    view2.getViewTreeObserver().removeOnDrawListener((okv0) this.f232406c);
                    return;
                }
                return;
            case 17:
                bkw0 bkw0Var = (bkw0) this.f232405b;
                nn40 nn40Var = bkw0Var.f28037d;
                Context context = bkw0Var.f28034a;
                vnc0 vnc0Var = (vnc0) this.f232406c;
                if (!nn40Var.f156326b) {
                    int i8 = MarqueeActivity.f5428e1;
                    Intent intent2 = new Intent(context, (Class<?>) MarqueeActivity.class);
                    intent2.putExtra("extra_marquee", vnc0Var);
                    intent2.setFlags(268500992);
                    context.startActivity(intent2);
                    return;
                }
                Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("spotify:internal:marquee"));
                intent3.setClassName(context, "com.spotify.tome.pageactivity.PageActivity");
                intent3.setFlags(268435456);
                intent3.putExtra("extra_marquee", vnc0Var);
                intent3.putExtra("is_internal_navigation", true);
                context.startActivity(intent3);
                return;
            case 18:
                ((WebView) this.f232405b).loadUrl(((Uri) this.f232406c).toString());
                return;
            case 19:
                ((nc0) this.f232405b).accept(this.f232406c);
                return;
            case 20:
                ody0 ody0Var = (ody0) this.f232405b;
                try {
                    ody0Var.f164285n = (phr0) ((jjc) this.f232406c).get();
                    if (ody0Var.f164286o) {
                        ody0Var.m66782f();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    zv41 zv41Var = ody0Var.f164281j;
                    edy0 edy0Var = new edy0(e2);
                    zv41Var.getClass();
                    zv41Var.m97091m(null, edy0Var);
                    return;
                }
            case 21:
                try {
                    m83615a();
                    return;
                } catch (Error e3) {
                    synchronized (((ftz0) this.f232406c).f73355b) {
                        ((ftz0) this.f232406c).f73356c = 1;
                        throw e3;
                    }
                }
            case 22:
                try {
                    ((Runnable) this.f232406c).run();
                    synchronized (((fc5) this.f232405b).f68008d) {
                        ((fc5) this.f232405b).m41292a();
                        break;
                    }
                    return;
                } catch (Throwable th2) {
                    synchronized (((fc5) this.f232405b).f68008d) {
                        ((fc5) this.f232405b).m41292a();
                        throw th2;
                    }
                }
            case 23:
                ((wk6) this.f232405b).m88361a((fv90) this.f232406c);
                return;
            case 24:
                int i9 = ((rje) this.f232405b).f199798b;
                Logger.m3965a(s571.m77246e(i9, "SmartShuffleCore client detached clientId="), new Object[0]);
                i031 i031Var = (i031) this.f232406c;
                i031Var.f97132t.onNext(new iz21(i9));
                i031Var.f97126d.f117274b.remove(Integer.valueOf(i9));
                return;
            case 25:
                le41 le41Var = (le41) this.f232405b;
                m7m m7mVar = (m7m) this.f232406c;
                le41Var.f132460o = m7mVar;
                kb21 kb21VarM58593a = le41Var.f132457l.m58593a();
                le41.m58766r1(le41Var, kb21VarM58593a, m7mVar);
                le41Var.f132457l = new lb21(kb21VarM58593a);
                le41.m58767s1(le41Var);
                return;
            case 26:
                eka1 eka1Var = (eka1) this.f232405b;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f232406c;
                for (xja1 xja1Var : ServiceLoader.load(xja1.class, xja1.class.getClassLoader())) {
                    for (wja1 wja1Var : xja1Var.mo27072b()) {
                        eka1Var.m39276b(wja1Var.f251922a, wja1Var.f251923b);
                    }
                    for (fka1 fka1Var : xja1Var.mo27071a()) {
                        linkedHashMap.put(fka1Var.getKey(), fka1Var);
                    }
                }
                return;
            case 27:
                vk61 vk61Var = (vk61) this.f232406c;
                int dimensionPixelSize = vk61Var.f242157e.getResources().getDimensionPixelSize(R.dimen.cwp_tab_margin);
                yk61 yk61Var = vk61Var.f242157e;
                ViewGroup.LayoutParams layoutParams = yk61Var.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginEnd(dimensionPixelSize);
                yk61Var.setLayoutParams(layoutParams2);
                return;
            case 28:
                CarouselLayoutManager carouselLayoutManager = ((rc81) this.f232405b).f197795n2;
                if (carouselLayoutManager == null) {
                    wj50.m88260d0("layoutManager");
                    throw null;
                }
                kc81 kc81Var = (kc81) this.f232406c;
                if (!kc81Var.f121404b && !kc81Var.f121408f) {
                    z = false;
                }
                carouselLayoutManager.f5014V0 = z;
                return;
            default:
                n491 n491Var = (n491) this.f232406c;
                View view3 = n491Var.f50039a;
                WeakReference weakReference = n491Var.f150280b1;
                ViewGroup viewGroup = (ViewGroup) weakReference.get();
                Barrier barrier = viewGroup != null ? (Barrier) viewGroup.findViewById(R.id.carousel_item_safe_barrier_top) : null;
                int top = barrier != null ? barrier.getTop() : 0;
                FrameLayout frameLayout = n491Var.f150281c1;
                ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams.topMargin = top;
                frameLayout.setLayoutParams(marginLayoutParams);
                hxt hxtVar = n491Var.f150285g1;
                if (hxtVar != null && (view = hxtVar.f96307t) != null) {
                    ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                    if (layoutParams4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                    marginLayoutParams2.topMargin = top;
                    view.setLayoutParams(marginLayoutParams2);
                }
                View view4 = n491Var.f150282d1.f96307t;
                ViewGroup.LayoutParams layoutParams5 = view4.getLayoutParams();
                if (layoutParams5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                layoutParams6.topMargin = view3.getContext().getResources().getDimensionPixelSize(R.dimen.encore_spacer_looser_3) + top;
                view4.setLayoutParams(layoutParams6);
                ViewGroup viewGroup2 = (ViewGroup) weakReference.get();
                Barrier barrier2 = viewGroup2 != null ? (Barrier) viewGroup2.findViewById(R.id.carousel_item_safe_barrier_bottom) : null;
                if (barrier2 != null) {
                    if (!barrier2.isLaidOut() || barrier2.isLayoutRequested()) {
                        barrier2.addOnLayoutChangeListener(new m491(n491Var, i2));
                    } else {
                        n491.m63663I(n491Var, view3.getHeight() - barrier2.getTop());
                    }
                }
                if (barrier2 != null) {
                    barrier2.addOnLayoutChangeListener(new m491(n491Var, i));
                    return;
                }
                return;
        }
    }

    public String toString() {
        String str;
        switch (this.f232404a) {
            case 21:
                Runnable runnable = (Runnable) this.f232405b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((ftz0) this.f232406c).f73356c;
                if (i == 1) {
                    str = "IDLE";
                } else if (i == 2) {
                    str = "QUEUING";
                } else if (i != 3) {
                    str = i != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public uod0(RecyclerView recyclerView, gvt0 gvt0Var, C2655zm c2655zm) {
        this.f232404a = 13;
        this.f232405b = gvt0Var;
        this.f232406c = c2655zm;
    }

    public /* synthetic */ uod0(Object obj, Object obj2, boolean z, int i) {
        this.f232404a = i;
        this.f232406c = obj;
        this.f232405b = obj2;
    }

    public uod0(gh50 gh50Var, ih50 ih50Var, long j) {
        this.f232404a = 9;
        this.f232405b = gh50Var;
        this.f232406c = ih50Var;
    }

    public uod0(ftz0 ftz0Var) {
        this.f232404a = 21;
        this.f232406c = ftz0Var;
    }
}
