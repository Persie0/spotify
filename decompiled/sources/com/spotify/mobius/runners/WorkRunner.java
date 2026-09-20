package com.spotify.mobius.runners;

import com.spotify.mobius.disposables.Disposable;

/* JADX INFO: loaded from: classes2.dex */
public interface WorkRunner extends Disposable {
    void post(Runnable runnable);
}
