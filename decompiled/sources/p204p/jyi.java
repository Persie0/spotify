package p204p;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes16.dex */
public final class jyi extends ArrayDeque {
    @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized boolean add(hyi hyiVar) {
        return super.add(hyiVar);
    }

    @Override // java.util.ArrayDeque, java.util.Deque, java.util.Queue
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized hyi peek() {
        return (hyi) super.peek();
    }

    @Override // java.util.ArrayDeque, java.util.Deque, java.util.Queue
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final synchronized hyi poll() {
        return (hyi) super.poll();
    }

    @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final synchronized int size() {
        return super.size();
    }
}
