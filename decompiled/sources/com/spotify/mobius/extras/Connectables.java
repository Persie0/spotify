package com.spotify.mobius.extras;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.extras.connections.ContramapConnection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Function;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Connectables {
    /* JADX INFO: renamed from: a */
    public static SimpleConnectable m15637a(final Function function, final Connectable connectable) {
        return new SimpleConnectable(new Function<Consumer<Object>, Connection<Object>>() { // from class: com.spotify.mobius.extras.Connectables.1
            @Override // com.spotify.mobius.functions.Function
            public final Object apply(Object obj) {
                Consumer consumer = (Consumer) obj;
                Connectable connectable2 = connectable;
                connectable2.getClass();
                consumer.getClass();
                return new ContramapConnection(function, connectable2, consumer);
            }
        });
    }
}
