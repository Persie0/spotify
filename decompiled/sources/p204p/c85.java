package p204p;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class c85 {
    /* JADX INFO: renamed from: a */
    public abstract void mo25031a(StaticLayout.Builder builder, TextView textView);

    /* JADX INFO: renamed from: b */
    public boolean mo28412b(TextView textView) {
        Object objInvoke = Boolean.FALSE;
        try {
            objInvoke = d85.m35247d("getHorizontallyScrolling").invoke(textView, null);
        } catch (Exception unused) {
        }
        return ((Boolean) objInvoke).booleanValue();
    }
}
