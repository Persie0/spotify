package p204p;

import android.media.MediaCodec;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.Task;
import com.spotify.music.R;
import io.reactivex.rxjava3.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ujh implements iuz0, Function, kic1, cy51, t6l0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f231031a;

    /* JADX INFO: renamed from: b */
    public final Object f231032b;

    /* JADX INFO: renamed from: c */
    public Object f231033c;

    public /* synthetic */ ujh(int i, Object obj, Object obj2) {
        this.f231031a = i;
        this.f231032b = obj;
        this.f231033c = obj2;
    }

    @Override // p204p.kic1
    /* JADX INFO: renamed from: a */
    public void mo33413a(RecyclerView recyclerView, hc80 hc80Var, AbstractC0110a abstractC0110a, boolean z) {
        ((v290) this.f231032b).mo33413a(recyclerView, hc80Var, abstractC0110a, z);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f231031a) {
            case 5:
                m93 m93Var = (m93) obj;
                String str = (String) this.f231033c;
                g3m g3mVar = (g3m) this.f231032b;
                boolean z = m93Var instanceof j93;
                x2m x2mVar = x2m.f257521a;
                if (z) {
                    return wj50.m88271j(g3mVar, x2mVar) ? new j93(g93.f77652f) : new j93(new h93(str));
                }
                if (m93Var instanceof k93) {
                    return wj50.m88271j(g3mVar, x2mVar) ? new k93(g93.f77653g) : new k93(new i93(str));
                }
                na6.m63957e("Should not be reached, this is a constrained integration.");
                return m93Var;
            case 6:
            default:
                return ((y4m) obj).mo33094a((String) this.f231032b, (voc1) this.f231033c);
            case 7:
                suj sujVar = (suj) this.f231032b;
                r7p r7pVar = (r7p) sujVar.f214137c;
                api apiVarM77296c = ((s5p) ((voi) sujVar.f214135a)).m77296c();
                String str2 = (String) this.f231033c;
                if (apiVarM77296c == null || !apiVarM77296c.mo26697m()) {
                    r7p.m74953j(r7pVar, str2, 6);
                }
                return Boolean.FALSE;
        }
    }

    @Override // p204p.iuz0
    /* JADX INFO: renamed from: b */
    public rr60 mo38852b(up60 up60Var) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f231033c;
        Class clsMo28587A = ((ife) up60Var).mo28587A();
        Object o3bVar = concurrentHashMap.get(clsMo28587A);
        if (o3bVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsMo28587A, (o3bVar = new o3b((rr60) ((gh00) this.f231032b).invoke(up60Var))))) != null) {
            o3bVar = objPutIfAbsent;
        }
        return ((o3b) o3bVar).f161333a;
    }

    @Override // p204p.kic1
    /* JADX INFO: renamed from: c */
    public void mo33414c(sp80 sp80Var) {
        ((v290) this.f231032b).mo33414c(sp80Var);
    }

    @Override // p204p.cy51
    /* JADX INFO: renamed from: d */
    public y7h1 mo27672d(Object obj) {
        Boolean bool = (Boolean) obj;
        v2l v2lVar = (v2l) this.f231033c;
        if (bool.booleanValue()) {
            Log.isLoggable("FirebaseCrashlytics", 3);
            boolean zBooleanValue = bool.booleanValue();
            mc7 mc7Var = v2lVar.f236679b;
            if (zBooleanValue) {
                ((ev61) mc7Var.f142089g).m40099d(null);
                return ((Task) this.f231032b).mo1519k((q4l) v2lVar.f236682e.f197471b, new fs9(this, 21));
            }
            mc7Var.getClass();
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        Log.isLoggable("FirebaseCrashlytics", 2);
        Iterator it = v2lVar.f236684g.m81787J().iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        twy twyVar = v2lVar.f236690m.f184447b.f139988b;
        m4l.m60809a(twyVar.m81794Q());
        m4l.m60809a(twyVar.m81793P());
        m4l.m60809a(twyVar.m81791N());
        v2lVar.f236694q.m40099d(null);
        return bga.m29102x(null);
    }

    /* JADX INFO: renamed from: e */
    public r52 m83282e() {
        Set setSingleton;
        ArrayList arrayList = new ArrayList(2);
        gfm gfmVar = (gfm) this.f231032b;
        s56 s56Var = (s56) gfmVar.f79382d.get();
        jg31.m53271i(s56Var);
        arrayList.add(s56Var);
        on31 on31Var = (on31) gfmVar.f79384f.get();
        jg31.m53271i(on31Var);
        arrayList.add(on31Var);
        if (arrayList.isEmpty()) {
            setSingleton = Collections.EMPTY_SET;
        } else {
            setSingleton = arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList));
        }
        LinkedHashMap linkedHashMapM92176o = xuf1.m92176o(2);
        r56 r56Var = (r56) gfmVar.f79381c.get();
        jg31.m53271i(r56Var);
        linkedHashMapM92176o.put(n56.class, r56Var);
        nn31 nn31Var = (nn31) gfmVar.f79383e.get();
        jg31.m53271i(nn31Var);
        linkedHashMapM92176o.put(vm31.class, nn31Var);
        return new r52(linkedHashMapM92176o.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMapM92176o), setSingleton);
    }

    /* JADX INFO: renamed from: f */
    public ahm m83283f() {
        return (ahm) ((h4t0) this.f231033c).get();
    }

    /* JADX INFO: renamed from: g */
    public boolean m83284g() {
        return ((hv31) this.f231032b).mo48713h(isi.f105259a, true);
    }

    /* JADX INFO: renamed from: h */
    public InputMethodManager m83285h() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f231033c;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        InputMethodManager inputMethodManager2 = (InputMethodManager) ((View) this.f231032b).getContext().getSystemService("input_method");
        this.f231033c = inputMethodManager2;
        return inputMethodManager2;
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        dx40 dx40VarMo51806g = swd1Var.f214650a.mo51806g(519);
        View view2 = (View) this.f231032b;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        hqk hqkVar = layoutParams instanceof hqk ? (hqk) layoutParams : null;
        if (hqkVar != null) {
            hqkVar.setMarginEnd(Math.max(dx40VarMo51806g.f53848a, ((CoordinatorLayout) this.f231033c).getResources().getDimensionPixelSize(R.dimen.adaptive_ui_header_play_button_end_margin)));
            view2.setLayoutParams(hqkVar);
        }
        return swd1Var;
    }

    public ujh(kv91 kv91Var) {
        this.f231031a = 8;
        this.f231032b = kv91Var;
        this.f231033c = st91.f213865b;
    }

    public ujh(rmm0 rmm0Var) {
        this.f231031a = 2;
        this.f231032b = xtm0.m92080a(1, 2, 4);
        this.f231033c = rmm0Var.mo29877i().mo27151a(uh1.f230320j, new wh1(this, 10));
    }

    public ujh(LinkedHashMap linkedHashMap, Map map, ny60 ny60Var) {
        this.f231031a = 10;
        this.f231032b = new v290(qsg1.m73737q(linkedHashMap), map, z290.f278518b, 0L, ny60Var);
        this.f231033c = map;
    }

    public ujh(zu0 zu0Var) {
        this.f231031a = 16;
        this.f231032b = zu0Var;
        this.f231033c = new lgm(this, 2);
    }

    public ujh(pgq0 pgq0Var) {
        this.f231031a = 17;
        this.f231032b = pgq0Var;
        this.f231033c = be21.m28868a(new lgm(this, 10));
    }

    public ujh(d97 d97Var) {
        this.f231031a = 22;
        this.f231032b = d97Var;
        this.f231033c = be21.m28868a(new akm(this, 24));
    }

    public ujh(z9t z9tVar) {
        this.f231031a = 28;
        this.f231032b = z9tVar;
        this.f231033c = be21.m28868a(new e0n(this, 14));
    }

    public ujh(r0e1 r0e1Var) {
        this.f231031a = 19;
        this.f231032b = r0e1Var;
        this.f231033c = be21.m28868a(new akm(this, 0));
    }

    /* JADX INFO: renamed from: i */
    public void mo83286i() {
    }

    public ujh(mfn mfnVar) {
        this.f231031a = 20;
        this.f231032b = mfnVar;
        this.f231033c = new akm(this, 9);
    }

    public ujh(mfn mfnVar, byte b) {
        this.f231031a = 29;
        this.f231032b = mfnVar;
        this.f231033c = be21.m28868a(new e0n(this, 24));
    }

    public ujh(mus musVar) {
        this.f231031a = 25;
        this.f231032b = musVar;
        this.f231033c = be21.m28868a(new tqm(this, 18));
    }

    public ujh(gpb gpbVar, hpb hpbVar) {
        this.f231031a = 21;
        this.f231032b = gpbVar;
        this.f231033c = b2s.m27972b(new akm(this, 16));
    }

    public ujh(jtz jtzVar, ktz ktzVar) {
        this.f231031a = 26;
        this.f231032b = jtzVar;
        this.f231033c = b2s.m27972b(new e0n(this, 0));
    }

    public ujh(zen zenVar, l3n l3nVar, yrq yrqVar) {
        this.f231031a = 18;
        this.f231032b = zenVar;
        this.f231033c = be21.m28868a(new lgm(this, 21));
    }

    public ujh(qs10 qs10Var, rs10 rs10Var, dcm0 dcm0Var) {
        this.f231031a = 27;
        this.f231032b = dcm0Var;
        this.f231033c = new e0n(this, 7);
    }

    public ujh(gfm gfmVar, ifm ifmVar, dcm0 dcm0Var) {
        this.f231031a = 24;
        this.f231032b = gfmVar;
        this.f231033c = be21.m28868a(new tqm(this, 9));
    }

    public ujh(zci zciVar, ynh ynhVar, edi ediVar) {
        this.f231031a = 23;
        this.f231032b = zciVar;
        this.f231033c = b2s.m27972b(new tqm(this, 0));
    }

    public ujh(View view) {
        this.f231031a = 0;
        this.f231032b = view;
    }

    public ujh(gh00 gh00Var) {
        this.f231031a = 1;
        this.f231032b = gh00Var;
        this.f231033c = new ConcurrentHashMap();
    }

    public ujh(MediaCodec.CryptoInfo cryptoInfo) {
        this.f231031a = 14;
        this.f231032b = cryptoInfo;
        this.f231033c = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public ujh(v2l v2lVar, Task task) {
        this.f231031a = 11;
        this.f231033c = v2lVar;
        this.f231032b = task;
    }
}
