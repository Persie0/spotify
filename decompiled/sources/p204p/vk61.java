package p204p;

import android.text.TextUtils;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class vk61 {

    /* JADX INFO: renamed from: a */
    public CharSequence f242153a;

    /* JADX INFO: renamed from: b */
    public int f242154b;

    /* JADX INFO: renamed from: c */
    public View f242155c;

    /* JADX INFO: renamed from: d */
    public TabLayout f242156d;

    /* JADX INFO: renamed from: e */
    public yk61 f242157e;

    /* JADX INFO: renamed from: a */
    public final void m85802a(String str) {
        if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(str)) {
            this.f242157e.setContentDescription(str);
        }
        this.f242153a = str;
        yk61 yk61Var = this.f242157e;
        if (yk61Var != null) {
            yk61Var.m93968e();
        }
    }
}
