package io.reactivex.rxjava3.exceptions;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Exceptions {
    /* JADX INFO: renamed from: a */
    public static void m23404a(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
