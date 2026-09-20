package p204p;

import android.view.View;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class o4c implements alc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f161624a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dkv0 f161625b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zkc1 f161626c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ q4c f161627d;

    public /* synthetic */ o4c(q4c q4cVar, dkv0 dkv0Var, zkc1 zkc1Var, int i) {
        this.f161624a = i;
        this.f161627d = q4cVar;
        this.f161625b = dkv0Var;
        this.f161626c = zkc1Var;
    }

    @Override // p204p.alc1
    /* JADX INFO: renamed from: a */
    public final void mo26286a(View view) {
        switch (this.f161624a) {
            case 0:
                m66242f(view);
                break;
            default:
                WeakHashMap weakHashMap = mec1.f142677a;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                break;
        }
    }

    @Override // p204p.alc1
    /* JADX INFO: renamed from: d */
    public final void mo26287d(View view) {
        switch (this.f161624a) {
            case 0:
                m66242f(view);
                break;
            default:
                view.setTag(R.id.paste_carousel_animation_info, null);
                this.f161626c.m96317f(null);
                q4c q4cVar = this.f161627d;
                ArrayList arrayList = q4cVar.f185140k;
                dkv0 dkv0Var = this.f161625b;
                arrayList.remove(dkv0Var);
                try {
                    q4cVar.m61992d(dkv0Var);
                    break;
                } catch (IllegalArgumentException unused) {
                }
                if (!q4cVar.mo33397i()) {
                    q4cVar.m61993e();
                }
                break;
        }
    }

    @Override // p204p.alc1
    /* JADX INFO: renamed from: e */
    public final void mo26288e() {
        int i = this.f161624a;
    }

    /* JADX INFO: renamed from: f */
    public void m66242f(View view) {
        this.f161626c.m96317f(null);
        WeakHashMap weakHashMap = mec1.f142677a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        q4c q4cVar = this.f161627d;
        ArrayList arrayList = q4cVar.f185141l;
        dkv0 dkv0Var = this.f161625b;
        arrayList.remove(dkv0Var);
        try {
            q4cVar.m61992d(dkv0Var);
        } catch (IllegalArgumentException unused) {
        }
        if (q4cVar.mo33397i()) {
            return;
        }
        q4cVar.m61993e();
    }

    /* JADX INFO: renamed from: b */
    private final void m66240b() {
    }

    /* JADX INFO: renamed from: c */
    private final void m66241c() {
    }
}
