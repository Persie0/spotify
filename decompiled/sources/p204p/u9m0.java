package p204p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public interface u9m0 {
    /* JADX INFO: renamed from: c */
    void mo24481c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* JADX INFO: renamed from: e */
    default void mo59670e(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        mo24481c(context, layoutInflater, viewGroup);
    }

    View getView();

    void start();

    void stop();
}
