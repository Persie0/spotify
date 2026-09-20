package p204p;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class dkv0 {

    /* JADX INFO: renamed from: R0 */
    public static final List f50029R0 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: P0 */
    public RecyclerView f50034P0;

    /* JADX INFO: renamed from: Q0 */
    public hjv0 f50035Q0;

    /* JADX INFO: renamed from: a */
    public final View f50039a;

    /* JADX INFO: renamed from: b */
    public WeakReference f50040b;

    /* JADX INFO: renamed from: t */
    public int f50048t;

    /* JADX INFO: renamed from: c */
    public int f50041c = -1;

    /* JADX INFO: renamed from: d */
    public int f50042d = -1;

    /* JADX INFO: renamed from: e */
    public long f50043e = -1;

    /* JADX INFO: renamed from: f */
    public int f50044f = -1;

    /* JADX INFO: renamed from: g */
    public int f50045g = -1;

    /* JADX INFO: renamed from: h */
    public dkv0 f50046h = null;

    /* JADX INFO: renamed from: i */
    public dkv0 f50047i = null;

    /* JADX INFO: renamed from: X */
    public ArrayList f50036X = null;

    /* JADX INFO: renamed from: Y */
    public List f50037Y = null;

    /* JADX INFO: renamed from: Z */
    public int f50038Z = 0;

    /* JADX INFO: renamed from: L0 */
    public vjv0 f50030L0 = null;

    /* JADX INFO: renamed from: M0 */
    public boolean f50031M0 = false;

    /* JADX INFO: renamed from: N0 */
    public int f50032N0 = 0;

    /* JADX INFO: renamed from: O0 */
    public int f50033O0 = -1;

    public dkv0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f50039a = view;
    }

    /* JADX INFO: renamed from: A */
    public final void m36318A(boolean z) {
        int i = this.f50038Z;
        int i2 = z ? i - 1 : i + 1;
        this.f50038Z = i2;
        if (i2 < 0) {
            this.f50038Z = 0;
            if (RecyclerView.f1179Z1) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            toString();
        } else if (!z && i2 == 1) {
            this.f50048t |= 16;
        } else if (z && i2 == 0) {
            this.f50048t &= -17;
        }
        if (RecyclerView.f1180a2) {
            toString();
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m36319B() {
        return (this.f50048t & 128) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m36320C() {
        return (this.f50048t & 32) != 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m36321k(int i) {
        this.f50048t = i | this.f50048t;
    }

    /* JADX INFO: renamed from: l */
    public final int m36322l() {
        RecyclerView recyclerView = this.f50034P0;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.m995P(this);
    }

    /* JADX INFO: renamed from: m */
    public final int m36323m() {
        RecyclerView recyclerView;
        hjv0 adapter;
        int iM995P;
        if (this.f50035Q0 == null || (recyclerView = this.f50034P0) == null || (adapter = recyclerView.getAdapter()) == null || (iM995P = this.f50034P0.m995P(this)) == -1) {
            return -1;
        }
        return adapter.mo47711d(this.f50035Q0, this, iM995P);
    }

    /* JADX INFO: renamed from: n */
    public final int m36324n() {
        int i = this.f50045g;
        return i == -1 ? this.f50041c : i;
    }

    /* JADX INFO: renamed from: o */
    public final List m36325o() {
        ArrayList arrayList;
        return ((this.f50048t & 1024) != 0 || (arrayList = this.f50036X) == null || arrayList.size() == 0) ? f50029R0 : this.f50037Y;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m36326p() {
        View view = this.f50039a;
        return (view.getParent() == null || view.getParent() == this.f50034P0) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m36327q() {
        return (this.f50048t & 1) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m36328r() {
        return (this.f50048t & 4) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m36329s() {
        if ((this.f50048t & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = mec1.f142677a;
        return !this.f50039a.hasTransientState();
    }

    /* JADX INFO: renamed from: t */
    public final boolean m36330t() {
        return (this.f50048t & 8) != 0;
    }

    public String toString() {
        StringBuilder sbM75191i = rbz.m75191i(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        sbM75191i.append(Integer.toHexString(hashCode()));
        sbM75191i.append(" position=");
        sbM75191i.append(this.f50041c);
        sbM75191i.append(" id=");
        sbM75191i.append(this.f50043e);
        sbM75191i.append(", oldPos=");
        sbM75191i.append(this.f50042d);
        sbM75191i.append(", pLpos:");
        sbM75191i.append(this.f50045g);
        StringBuilder sb = new StringBuilder(sbM75191i.toString());
        if (m36331u()) {
            sb.append(" scrap ");
            sb.append(this.f50031M0 ? "[changeScrap]" : "[attachedScrap]");
        }
        if (m36328r()) {
            sb.append(" invalid");
        }
        if (!m36327q()) {
            sb.append(" unbound");
        }
        if ((this.f50048t & 2) != 0) {
            sb.append(" update");
        }
        if (m36330t()) {
            sb.append(" removed");
        }
        if (m36319B()) {
            sb.append(" ignored");
        }
        if (m36332v()) {
            sb.append(" tmpDetached");
        }
        if (!m36329s()) {
            sb.append(" not recyclable(" + this.f50038Z + ")");
        }
        if ((this.f50048t & 512) != 0 || m36328r()) {
            sb.append(" undefined adapter position");
        }
        if (this.f50039a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m36331u() {
        return this.f50030L0 != null;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m36332v() {
        return (this.f50048t & 256) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m36333w() {
        return (this.f50048t & 2) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final void m36334x(int i, boolean z) {
        if (this.f50042d == -1) {
            this.f50042d = this.f50041c;
        }
        if (this.f50045g == -1) {
            this.f50045g = this.f50041c;
        }
        if (z) {
            this.f50045g += i;
        }
        this.f50041c += i;
        View view = this.f50039a;
        if (view.getLayoutParams() != null) {
            ((ojv0) view.getLayoutParams()).f166149c = true;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m36335z() {
        if (RecyclerView.f1179Z1 && m36332v()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.f50048t = 0;
        this.f50041c = -1;
        this.f50042d = -1;
        this.f50043e = -1L;
        this.f50045g = -1;
        this.f50038Z = 0;
        this.f50046h = null;
        this.f50047i = null;
        ArrayList arrayList = this.f50036X;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f50048t &= -1025;
        this.f50032N0 = 0;
        this.f50033O0 = -1;
        RecyclerView.m977o(this);
    }
}
