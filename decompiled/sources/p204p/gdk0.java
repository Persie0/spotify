package p204p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes7.dex */
public interface gdk0 {
    /* JADX INFO: renamed from: a */
    View mo24410a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    void start();

    void stop();

    default void destroy() {
    }
}
