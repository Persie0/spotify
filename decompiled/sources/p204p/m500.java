package p204p;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class m500 extends cwf implements ye0 {

    /* JADX INFO: renamed from: U0 */
    public boolean f140066U0;

    /* JADX INFO: renamed from: V0 */
    public boolean f140067V0;

    /* JADX INFO: renamed from: S0 */
    public final z4y f140064S0 = z4y.m95382b(new l500(this));

    /* JADX INFO: renamed from: T0 */
    public final oc80 f140065T0 = new oc80(this, true);

    /* JADX INFO: renamed from: W0 */
    public boolean f140068W0 = true;

    public m500() {
        this.f42740d.m59915g().m41110c("android:support:lifecycle", new kwr(this, 1));
        final int i = 0;
        mo34129c0(new y8j(this) { // from class: p.j500

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ m500 f108831b;

            {
                this.f108831b = this;
            }

            @Override // p204p.y8j
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.f108831b.f140064S0.m95409y();
                        break;
                    default:
                        this.f108831b.f140064S0.m95409y();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.f42736Y.add(new y8j(this) { // from class: p.j500

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ m500 f108831b;

            {
                this.f108831b = this;
            }

            @Override // p204p.y8j
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        this.f108831b.f140064S0.m95409y();
                        break;
                    default:
                        this.f108831b.f140064S0.m95409y();
                        break;
                }
            }
        });
        this.f42738b.m43220a(new w7l0() { // from class: p.k500
            @Override // p204p.w7l0
            /* JADX INFO: renamed from: a */
            public final void mo55415a() {
                this.f119378a.f140064S0.m95390a();
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public static boolean m60818h0(c700 c700Var) {
        boolean zM60818h0 = false;
        for (i500 i500Var : c700Var.f34668c.m89877x()) {
            if (i500Var != null) {
                c600 c600Var = i500Var.f98681T0;
                if ((c600Var == null ? null : c600Var.mo31499Z()) != null) {
                    zM60818h0 |= m60818h0(i500Var.m49716o0());
                }
                y800 y800Var = i500Var.f98717r1;
                fb80 fb80Var = fb80.f67752c;
                fb80 fb80Var2 = fb80.f67753d;
                if (y800Var != null) {
                    y800Var.m93034b();
                    if (y800Var.f270161e.f163857d.m41223a(fb80Var2)) {
                        i500Var.f98717r1.f270161e.m66678i(fb80Var);
                        zM60818h0 = true;
                    }
                }
                if (i500Var.f98716q1.f163857d.m41223a(fb80Var2)) {
                    i500Var.f98716q1.m66678i(fb80Var);
                    zM60818h0 = true;
                }
            }
        }
        return zM60818h0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                    }
                    break;
            }
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f140066U0);
        printWriter.print(" mResumed=");
        printWriter.print(this.f140067V0);
        printWriter.print(" mStopped=");
        printWriter.print(this.f140068W0);
        if (getApplication() != null) {
            vw90.m86531p(this).m86540n(str3, fileDescriptor, printWriter, strArr);
        }
        this.f140064S0.m95407w().m31654v(str, fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: renamed from: g0 */
    public c700 mo15683g0() {
        return this.f140064S0.m95407w();
    }

    @Override // p204p.cwf, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f140064S0.m95409y();
        super.onActivityResult(i, i2, intent);
    }

    @Override // p204p.cwf, p204p.bwf, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f140065T0.m66676g(ta80.ON_CREATE);
        this.f140064S0.m95393f();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewM95410z = this.f140064S0.m95410z(view, str, context, attributeSet);
        return viewM95410z == null ? super.onCreateView(view, str, context, attributeSet) : viewM95410z;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f140064S0.m95394g();
        this.f140065T0.m66676g(ta80.ON_DESTROY);
    }

    @Override // p204p.cwf, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.f140064S0.m95392e();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f140067V0 = false;
        this.f140064S0.m95396j();
        this.f140065T0.m66676g(ta80.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f140065T0.m66676g(ta80.ON_RESUME);
        this.f140064S0.m95397k();
    }

    @Override // p204p.cwf, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f140064S0.m95409y();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        z4y z4yVar = this.f140064S0;
        z4yVar.m95409y();
        super.onResume();
        this.f140067V0 = true;
        z4yVar.m95400n();
    }

    @Override // android.app.Activity
    public void onStart() {
        z4y z4yVar = this.f140064S0;
        z4yVar.m95409y();
        super.onStart();
        this.f140068W0 = false;
        if (!this.f140066U0) {
            this.f140066U0 = true;
            z4yVar.m95391c();
        }
        z4yVar.m95400n();
        this.f140065T0.m66676g(ta80.ON_START);
        z4yVar.m95398l();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f140064S0.m95409y();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f140068W0 = true;
        while (m60818h0(mo15683g0())) {
        }
        this.f140064S0.m95399m();
        this.f140065T0.m66676g(ta80.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewM95410z = this.f140064S0.m95410z(null, str, context, attributeSet);
        return viewM95410z == null ? super.onCreateView(str, context, attributeSet) : viewM95410z;
    }

    /* JADX INFO: renamed from: i0 */
    public void mo13408i0(i500 i500Var) {
    }
}
