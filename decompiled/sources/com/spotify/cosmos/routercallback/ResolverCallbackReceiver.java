package com.spotify.cosmos.routercallback;

import android.os.Handler;
import android.os.Looper;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b&\u0018\u0000 \u001e*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u001f\u001eB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000eJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0017¨\u0006 "}, m24212d2 = {"Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;", "T", "", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/os/Handler;)V", "response", "Lp/w2a1;", "onResolved", "(Ljava/lang/Object;)V", "", "error", "onError", "(Ljava/lang/Throwable;)V", "sendOnResolved", "sendOnError", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "id", "I", "getId", "Companion", "LocalRunnable", "src_main_java_com_spotify_cosmos_routercallback-routercallback"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class ResolverCallbackReceiver<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AtomicInteger ID_GEN = new AtomicInteger(0);
    private final Handler handler;
    private final int id = INSTANCE.createId();

    @Metadata(m24211d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0001\u0010\u0006*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\bH\u0007J>\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0001\u0010\u0006*\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\bH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver$Companion;", "", "<init>", "()V", "forUI", "Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;", "T", "onResolved", "Lio/reactivex/rxjava3/functions/Consumer;", "onError", "", "forAny", "handler", "Landroid/os/Handler;", "ID_GEN", "Ljava/util/concurrent/atomic/AtomicInteger;", "createId", "", "src_main_java_com_spotify_cosmos_routercallback-routercallback"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int createId() {
            return ResolverCallbackReceiver.ID_GEN.getAndIncrement();
        }

        public final <T> ResolverCallbackReceiver<T> forAny(final Handler handler, final Consumer<T> onResolved, final Consumer<Throwable> onError) {
            return new ResolverCallbackReceiver<T>(handler) { // from class: com.spotify.cosmos.routercallback.ResolverCallbackReceiver$Companion$forAny$1
                @Override // com.spotify.cosmos.routercallback.ResolverCallbackReceiver
                public void onError(Throwable error) {
                    try {
                        onError.accept(error);
                    } catch (Throwable th) {
                        throw ExceptionHelper.m23754f(th);
                    }
                }

                @Override // com.spotify.cosmos.routercallback.ResolverCallbackReceiver
                public void onResolved(T response) {
                    try {
                        onResolved.accept(response);
                    } catch (Throwable th) {
                        throw ExceptionHelper.m23754f(th);
                    }
                }
            };
        }

        public final <T> ResolverCallbackReceiver<T> forUI(Consumer<T> onResolved, Consumer<Throwable> onError) {
            return forAny(new Handler(Looper.getMainLooper()), onResolved, onError);
        }

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\b¨\u0006\t"}, m24212d2 = {"Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver$LocalRunnable;", "Ljava/lang/Runnable;", "response", "<init>", "(Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;Ljava/lang/Object;)V", "Lp/w2a1;", "run", "()V", "Ljava/lang/Object;", "src_main_java_com_spotify_cosmos_routercallback-routercallback"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public final class LocalRunnable implements Runnable {
        private final T response;

        public LocalRunnable(T t) {
            this.response = t;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResolverCallbackReceiver.this.onResolved(this.response);
        }
    }

    public ResolverCallbackReceiver(Handler handler) {
        this.handler = handler;
    }

    public static final <T> ResolverCallbackReceiver<T> forAny(Handler handler, Consumer<T> consumer, Consumer<Throwable> consumer2) {
        return INSTANCE.forAny(handler, consumer, consumer2);
    }

    public static final <T> ResolverCallbackReceiver<T> forUI(Consumer<T> consumer, Consumer<Throwable> consumer2) {
        return INSTANCE.forUI(consumer, consumer2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ResolverCallbackReceiver) && ((ResolverCallbackReceiver) other).id == this.id;
    }

    public final Handler getHandler() {
        return this.handler;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return this.id;
    }

    public abstract void onError(Throwable error);

    public abstract void onResolved(T response);

    public final void sendOnError(final Throwable error) {
        Handler handler = this.handler;
        if (handler != null) {
            handler.post(new Runnable(this) { // from class: com.spotify.cosmos.routercallback.ResolverCallbackReceiver.sendOnError.1
                final /* synthetic */ ResolverCallbackReceiver<T> this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.this$0.onError(error);
                }
            });
        } else {
            onError(error);
        }
    }

    public void sendOnResolved(T response) {
        Handler handler = this.handler;
        if (handler != null) {
            handler.post(new LocalRunnable(response));
        } else {
            onResolved(response);
        }
    }
}
