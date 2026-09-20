package p204p;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m24212d2 = {"Lp/khr;", "Lp/i500;", "<init>", "()V", "p/jhr", "src_main_java_com_spotify_tome_dialog-dialog"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class khr extends i500 {

    /* JADX INFO: renamed from: A1 */
    public ArrayList f122711A1 = new ArrayList();

    /* JADX INFO: renamed from: B1 */
    public ArrayList f122712B1 = new ArrayList();

    /* JADX INFO: renamed from: C1 */
    public jhr f122713C1;

    /* JADX INFO: renamed from: D1 */
    public boolean f122714D1;

    @Override // p204p.i500
    /* JADX INFO: renamed from: D0 */
    public final synchronized void mo26182D0(int i, int i2, Intent intent) {
        jhr jhrVar = (jhr) this.f122711A1.get(i - 1);
        i500 i500VarM31604F = m49720s0().m31604F(jhrVar != null ? jhrVar.f112555a : null);
        qzq0 qzq0Var = i500VarM31604F instanceof qzq0 ? (qzq0) i500VarM31604F : null;
        Objects.toString(qzq0Var);
        if (qzq0Var == null) {
            return;
        }
        na6.m63954b(jhrVar, this.f122713C1);
        this.f122713C1 = null;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: F0 */
    public final void mo876F0(Bundle bundle) {
        super.mo876F0(bundle);
        if (bundle != null) {
            synchronized (this) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("request_code_map");
                if (parcelableArrayList == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                this.f122711A1 = parcelableArrayList;
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("dialog_queue");
                if (parcelableArrayList2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                this.f122712B1 = parcelableArrayList2;
                this.f122713C1 = (jhr) bundle.getParcelable("current_dialog");
            }
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: M0 */
    public final void mo3094M0() {
        this.f98702f1 = true;
        this.f122714D1 = false;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: N0 */
    public final void mo3095N0() {
        this.f122714D1 = true;
        if (this.f122713C1 == null) {
            m56451h1();
        }
        this.f98702f1 = true;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: O0 */
    public final void mo880O0(Bundle bundle) {
        bundle.putParcelableArrayList("request_code_map", this.f122711A1);
        bundle.putParcelableArrayList("dialog_queue", this.f122712B1);
        bundle.putParcelable("current_dialog", this.f122713C1);
    }

    /* JADX INFO: renamed from: h1 */
    public final synchronized void m56451h1() {
        try {
            if (this.f122714D1) {
                if (this.f122712B1.isEmpty()) {
                    return;
                }
                if (this.f122713C1 != null) {
                    return;
                }
                jhr jhrVar = (jhr) this.f122712B1.remove(0);
                this.f122713C1 = jhrVar;
                i500 i500VarM31604F = m49720s0().m31604F(jhrVar != null ? jhrVar.f112555a : null);
                qzq0 qzq0Var = i500VarM31604F instanceof qzq0 ? (qzq0) i500VarM31604F : null;
                if (qzq0Var != null) {
                    qzq0Var.toString();
                    qzq0Var.mo26183h1();
                } else {
                    jhr jhrVar2 = this.f122713C1;
                    throw new AssertionError("Cannot find fragment with tag " + (jhrVar2 != null ? jhrVar2.f112555a : null));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final synchronized void m56452i1(qzq0 qzq0Var) {
        Objects.toString(qzq0Var);
        this.f122712B1.add(new jhr(qzq0Var.f98688Y0));
        m56451h1();
    }
}
