package p204p;

import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yie {

    /* JADX INFO: renamed from: a */
    public static final long f273098a = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: a */
    public static final boolean m93735a(AbstractC2203o6 abstractC2203o6) {
        ViewParent parent = yjg1.m93925q(abstractC2203o6).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}
