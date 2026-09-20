package com.spotify.mobius;

import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.internal_util.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class MergedEventSource<E> implements EventSource<E> {

    /* JADX INFO: renamed from: a */
    public final ArrayList f5567a;

    public MergedEventSource(ArrayList arrayList) {
        this.f5567a = arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static MergedEventSource m15578b(EventSource eventSource, EventSource... eventSourceArr) {
        ArrayList arrayList = new ArrayList();
        Preconditions.m15649b(eventSource);
        arrayList.add(eventSource);
        for (EventSource eventSource2 : eventSourceArr) {
            Preconditions.m15649b(eventSource2);
            arrayList.add(eventSource2);
        }
        return new MergedEventSource(arrayList);
    }

    @Override // com.spotify.mobius.EventSource
    /* JADX INFO: renamed from: a */
    public final Disposable mo15572a(Consumer consumer) {
        ArrayList arrayList = this.f5567a;
        final ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<E> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EventSource) it.next()).mo15572a(consumer));
        }
        return new Disposable() { // from class: com.spotify.mobius.MergedEventSource.1
            @Override // com.spotify.mobius.disposables.Disposable
            public final void dispose() {
                Iterator<E> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((Disposable) it2.next()).dispose();
                }
            }
        };
    }
}
