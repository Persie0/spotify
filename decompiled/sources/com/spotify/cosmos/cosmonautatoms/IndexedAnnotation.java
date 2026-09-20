package com.spotify.cosmos.cosmonautatoms;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import p204p.wj50;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000e\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautatoms/IndexedAnnotation;", "T", "", "", "annot", "index", "", "<init>", "(Ljava/lang/annotation/Annotation;I)V", "getAnnot", "()Ljava/lang/annotation/Annotation;", "Ljava/lang/annotation/Annotation;", "getIndex", "()I", "component1", "component2", "copy", "(Ljava/lang/annotation/Annotation;I)Lcom/spotify/cosmos/cosmonautatoms/IndexedAnnotation;", "equals", "", "other", "hashCode", "toString", "", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final /* data */ class IndexedAnnotation<T extends Annotation> {
    private final T annot;
    private final int index;

    public IndexedAnnotation(T t, int i) {
        this.annot = t;
        this.index = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IndexedAnnotation copy$default(IndexedAnnotation indexedAnnotation, Annotation annotation, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            annotation = indexedAnnotation.annot;
        }
        if ((i2 & 2) != 0) {
            i = indexedAnnotation.index;
        }
        return indexedAnnotation.copy(annotation, i);
    }

    public final T component1() {
        return this.annot;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final IndexedAnnotation<T> copy(T annot, int index) {
        return new IndexedAnnotation<>(annot, index);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndexedAnnotation)) {
            return false;
        }
        IndexedAnnotation indexedAnnotation = (IndexedAnnotation) other;
        return wj50.m88271j(this.annot, indexedAnnotation.annot) && this.index == indexedAnnotation.index;
    }

    public final T getAnnot() {
        return this.annot;
    }

    public final int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return Integer.hashCode(this.index) + (this.annot.hashCode() * 31);
    }

    public String toString() {
        return super.toString();
    }
}
